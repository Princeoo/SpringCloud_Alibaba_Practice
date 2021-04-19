package com.princeoo.cloud_service_regist5001.controller;


import com.princeoo.cloud_service_regist5001.pojo.Payment;
import com.princeoo.cloud_service_regist5001.result.CommonResult;
import com.princeoo.cloud_service_regist5001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RefreshScope//实现配置自动更新
public class RegistController {

    @Value("${server.port}")
    private String serverPort;


    @Resource
    private PaymentService paymentService;


    @Value("${username:lily}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }


//    @Value("${config.appKey}")
//    private String appKey;
//
//
//    @GetMapping("/getAppKey")
//    public String getAppKey() {
//        return this.appKey;
//    }

    //只传给前端CommonResult，不需要前端了解其他的组件
    @PostMapping(value = "/getregist/create")
    public CommonResult create(Payment payment) {

        int result = paymentService.create(payment);
        //log.info("*****插入结果："+result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort：" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }


    @GetMapping(value = "/getregist/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        //log.info("*****插入结果："+payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort：" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID：" + id, null);
        }
    }
}