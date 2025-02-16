package com.muyang.muyangpicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.muyang.muyangpicturebackend.model.dto.space.analyze.*;
import com.muyang.muyangpicturebackend.model.entity.Space;
import com.muyang.muyangpicturebackend.model.entity.User;
import com.muyang.muyangpicturebackend.model.vo.space.analyze.*;

import java.util.List;

/**
* @author lenovo
* @description 针对表【space(空间)】的分析Service
* @createDate 2025-02-14 21:29:15
*/
public interface SpaceAnalyzeService extends IService<Space> {

    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
