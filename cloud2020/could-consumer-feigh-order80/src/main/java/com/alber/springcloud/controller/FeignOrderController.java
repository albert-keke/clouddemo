package com.alber.springcloud.controller;

import com.alber.springcloud.service.PaymentFeignService;
import com.albert.springcloud.entities.CommonResult;
import com.albert.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther cyq
 * @create 15:24 2020/6/13
 */
@RestController
public class FeignOrderController {
    @Autowired
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String pyamentFeignTimeOut(){
        return paymentFeignService.pyamentFeignTimeOut();
    }

}
