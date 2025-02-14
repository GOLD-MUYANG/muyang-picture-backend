package com.muyang.muyangpicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 用于判断是新增还是更新图片,测试时不传id就能表示新增图片
     */
    private Long id;

    /**
     * 文件地址
     */
    private String fileUrl;

    private static final long serialVersionUID = 1L;
}

