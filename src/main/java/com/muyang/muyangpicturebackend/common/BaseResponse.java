package com.muyang.muyangpicturebackend.common;

import com.muyang.muyangpicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 全局相应封装类
 */
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;


    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

