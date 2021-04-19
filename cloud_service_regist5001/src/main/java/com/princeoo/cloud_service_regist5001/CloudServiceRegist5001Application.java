package com.princeoo.cloud_service_regist5001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//开启服务注册发现功能
public class CloudServiceRegist5001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceRegist5001Application.class, args);
    }

}
