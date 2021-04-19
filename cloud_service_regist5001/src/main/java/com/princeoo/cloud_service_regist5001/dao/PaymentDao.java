package com.princeoo.cloud_service_regist5001.dao;


import com.princeoo.cloud_service_regist5001.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: xiaoJie
 * @Date: 2021/4/14 4:42 下午
 * @Description:
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
