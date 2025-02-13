package com.muyang.muyangpicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-13 14:36:36
 */

/**
 * 图片标签分类列表视图
 */
@Data
public class PictureTagCategory {

    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> CategoryList;
}
