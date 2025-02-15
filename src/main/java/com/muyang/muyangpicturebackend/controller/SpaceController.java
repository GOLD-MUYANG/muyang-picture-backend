package com.muyang.muyangpicturebackend.controller;

import com.muyang.muyangpicturebackend.annotataion.AuthCheck;
import com.muyang.muyangpicturebackend.common.BaseResponse;
import com.muyang.muyangpicturebackend.common.ResultUtils;
import com.muyang.muyangpicturebackend.constant.UserConstant;
import com.muyang.muyangpicturebackend.exception.BusinessException;
import com.muyang.muyangpicturebackend.exception.ErrorCode;
import com.muyang.muyangpicturebackend.exception.ThrowUtils;
import com.muyang.muyangpicturebackend.model.dto.space.SpaceLevel;
import com.muyang.muyangpicturebackend.model.dto.space.SpaceUpdateRequest;
import com.muyang.muyangpicturebackend.model.entity.Space;
import com.muyang.muyangpicturebackend.model.enums.SpaceLevelEnum;
import com.muyang.muyangpicturebackend.service.SpaceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-15 10:53:46
 */
@Slf4j
@RestController
@RequestMapping("/space")
public class SpaceController {
    @Resource
    private SpaceService spaceService;

    /**
     * 更新空间
     * @param spaceUpdateRequest
     * @return
     */
    @PostMapping("/update")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<Boolean> updateSpace(@RequestBody SpaceUpdateRequest spaceUpdateRequest) {
        if (spaceUpdateRequest == null || spaceUpdateRequest.getId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 将实体类和 DTO 进行转换
        Space space = new Space();
        BeanUtils.copyProperties(spaceUpdateRequest, space);
        // 自动填充数据
        spaceService.fillSpaceBySpaceLevel(space);
        // 数据校验
        spaceService.validSpace(space, false);
        // 判断是否存在
        long id = spaceUpdateRequest.getId();
        Space oldSpace = spaceService.getById(id);
        ThrowUtils.throwIf(oldSpace == null, ErrorCode.NOT_FOUND_ERROR);
        // 操作数据库
        boolean result = spaceService.updateById(space);
        ThrowUtils.throwIf(!result, ErrorCode.OPERATION_ERROR);
        return ResultUtils.success(true);
    }

    /**
     * 获取空间等级列表
     * @return
     */
    @GetMapping("/list/level")
    public BaseResponse<List<SpaceLevel>> listSpaceLevel() {
        List<SpaceLevel> spaceLevelList = Arrays.stream(SpaceLevelEnum.values()) // 获取所有枚举
                .map(spaceLevelEnum -> new SpaceLevel(
                        spaceLevelEnum.getValue(),
                        spaceLevelEnum.getText(),
                        spaceLevelEnum.getMaxCount(),
                        spaceLevelEnum.getMaxSize()))
                .collect(Collectors.toList());
        return ResultUtils.success(spaceLevelList);
    }


}
