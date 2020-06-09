package com.albert.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther cyq
 * @create 23:39 2020/6/9
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMian8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMian8002.class,args);
    }
}
