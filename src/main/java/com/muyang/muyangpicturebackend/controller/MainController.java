package com.muyang.muyangpicturebackend.controller;

import com.muyang.muyangpicturebackend.common.BaseResponse;
import com.muyang.muyangpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-01-22 23:51:02
 */

@RestController("/")
public class MainController {
    /**
     * 健康检查
     * @return ok
     */
    @GetMapping("/health")
    public BaseResponse<String> health(){
        return ResultUtils.success("ok");
    }
}
