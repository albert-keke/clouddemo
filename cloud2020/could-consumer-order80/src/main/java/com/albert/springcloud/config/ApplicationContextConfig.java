package com.albert.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther cyq
 * @create 22:58 2020/6/7
 */
@Configuration
@Slf4j
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        log.info("ribon 默认轮询算法");
        return new RestTemplate();
    }
}
//applicationContext.xml  <bean id="" calss="">
