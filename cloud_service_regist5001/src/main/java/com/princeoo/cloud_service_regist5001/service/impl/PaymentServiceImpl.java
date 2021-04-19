package com.princeoo.cloud_service_regist5001.service.impl;


import com.princeoo.cloud_service_regist5001.dao.PaymentDao;

import com.princeoo.cloud_service_regist5001.pojo.Payment;
import com.princeoo.cloud_service_regist5001.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}