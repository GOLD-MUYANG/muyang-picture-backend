package com.muyang.muyangpicturebackend.utils;

/**
 * @author 李传旭
 * @version 1.0
 * @since 2025-02-15 22:32:27
 */
public class ColorTransformUtils {
    public ColorTransformUtils() {
    }

    /**
     * 获取标准颜色，调用的库传来的数据有问题，
     *
     * @param color 颜色
     * @return String
     */
    public static String getStandardColor(String color) {
        //如果rgb颜色有六位，不用转换，如果是五位，则在第三位后面加一个0
        if (color.length() == 7){
            color = color.substring(0,4)+"0"+color.substring(4,7);
        }
        return color;
    }
}
