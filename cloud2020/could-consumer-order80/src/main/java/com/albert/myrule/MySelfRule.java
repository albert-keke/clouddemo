package com.albert.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther cyq
 * @create 0:43 2020/6/11
 */
@Configuration
@Slf4j
public class MySelfRule {
    @Bean
    public IRule myRule() {
        log.info("得到随机轮询服务实例");
        return new RandomRule(); // 随机轮询
    }
}
