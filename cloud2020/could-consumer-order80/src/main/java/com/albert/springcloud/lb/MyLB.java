package com.albert.springcloud.lb;

import com.albert.springcloud.lb.LoadBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther cyq
 * @create 1:30 2020/6/11
 */
@Component
@Slf4j
public class MyLB implements LoadBalance {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    /**
     * @description: <请求次数>
     *
     * @auther: cyq
     * @create: 1:36 2020/6/11
     */
    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        log.info("得到自定义负载算法的服务实例");
        return serviceInstances.get(index);
    }
}
