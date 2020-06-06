package com.albert.springcloud.service.impl;

import com.albert.springcloud.dao.PaymentDao;
import com.albert.springcloud.entities.Payment;
import com.albert.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther cyq
 * @create 21:38 2020/6/6
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
