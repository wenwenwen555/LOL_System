package com.kun.exception;

import lombok.Data;

@Data
public class BizException extends RuntimeException{
    private Integer code;

    private String message;

    public static BizException of(Integer code, String message) {
        BizException bizException = new BizException();
        bizException.setCode(code);
        bizException.setMessage(message);
        return bizException;
    }

    public static BizException of(String message) {
        BizException bizException = new BizException();
        bizException.setCode(10000);
        bizException.setMessage(message);
        return bizException;
    }
}