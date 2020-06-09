package com.albert.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther cyq
 * @create 23:01 2020/6/9
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMian7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMian7002.class,args);
    }
}
