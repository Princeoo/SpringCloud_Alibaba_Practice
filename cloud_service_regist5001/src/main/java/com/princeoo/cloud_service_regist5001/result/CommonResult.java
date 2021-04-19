package com.princeoo.cloud_service_regist5001.result;

/**
 * @Auther: xiaoJie
 * @Date: 2021/4/14 4:48 下午
 * @Description:
 */
public class CommonResult<E> {
    int status;
    String message;
    E result;

    public CommonResult(int status, String message, E result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
}
