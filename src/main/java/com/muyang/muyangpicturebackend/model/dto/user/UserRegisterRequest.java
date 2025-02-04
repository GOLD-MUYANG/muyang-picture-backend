package com.muyang.muyangpicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-03 18:21:24
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -1970355483457058450L;
    //账号
    private String userAccount;
    //密码
    private String userPassword;
    //确认密码
    private String checkPassword;

}
