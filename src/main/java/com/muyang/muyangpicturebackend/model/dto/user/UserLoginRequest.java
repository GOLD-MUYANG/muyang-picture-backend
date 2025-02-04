package com.muyang.muyangpicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-04 16:33:54
 */
@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = -2861610967727233468L;
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 密码
     */
    private String userPassword;
}
