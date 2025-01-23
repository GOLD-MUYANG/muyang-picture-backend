package com.muyang.muyangpicturebackend.exception;

import lombok.Getter;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-01-22 23:07:12
 */

@Getter
public class BusinessException extends RuntimeException{

    /*
    错误码
     */
    private final int code;



    public BusinessException(int code,String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }
    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
