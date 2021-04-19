package com.princeoo.cloud_service_regist5001.service;



import com.princeoo.cloud_service_regist5001.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
