package com.muyang.muyangpicturebackend.service;

import com.muyang.muyangpicturebackend.model.dto.space.SpaceAddRequest;
import com.muyang.muyangpicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.muyang.muyangpicturebackend.model.entity.User;

/**
* @author lenovo
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-02-14 21:29:15
*/
public interface SpaceService extends IService<Space> {

    void validSpace(Space space, boolean add);

    void fillSpaceBySpaceLevel(Space space);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
}
