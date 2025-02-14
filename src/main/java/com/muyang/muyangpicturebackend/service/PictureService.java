package com.muyang.muyangpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.muyang.muyangpicturebackend.model.dto.picture.PictureQueryRequest;
import com.muyang.muyangpicturebackend.model.dto.picture.PictureReviewRequest;
import com.muyang.muyangpicturebackend.model.dto.picture.PictureUploadRequest;
import com.muyang.muyangpicturebackend.model.entity.Picture;
import com.muyang.muyangpicturebackend.model.entity.User;
import com.muyang.muyangpicturebackend.model.vo.PictureVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author lenovo
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-02-12 23:21:26
*/
public interface PictureService extends IService<Picture> {
    PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);
}
