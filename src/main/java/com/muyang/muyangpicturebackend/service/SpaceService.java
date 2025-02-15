package com.muyang.muyangpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.muyang.muyangpicturebackend.model.dto.space.SpaceAddRequest;
import com.muyang.muyangpicturebackend.model.dto.space.SpaceQueryRequest;
import com.muyang.muyangpicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.muyang.muyangpicturebackend.model.entity.User;
import com.muyang.muyangpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author lenovo
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-02-14 21:29:15
*/
public interface SpaceService extends IService<Space> {

    void validSpace(Space space, boolean add);

    void fillSpaceBySpaceLevel(Space space);

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void checkSpaceAuth(User loginUser, Space space);
}
