package com.muyang.muyangpicturebackend.constant;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-04 17:01:59
 * @description 用户常量,特意给authCheck注解使用
 * @date 2025/2/4 17:02
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    // endregion
}

