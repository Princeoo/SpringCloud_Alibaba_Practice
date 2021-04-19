package com.princeoo.cloud_service_regist5001.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Payment {
    private Long id;
    private String serial;

    public Payment() {

    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }
}