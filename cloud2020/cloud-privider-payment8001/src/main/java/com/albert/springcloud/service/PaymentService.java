package com.albert.springcloud.service;

import com.albert.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther cyq
 * @create 21:37 2020/6/6
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
