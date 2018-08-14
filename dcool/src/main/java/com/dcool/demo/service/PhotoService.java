package com.dcool.demo.service;

import com.dcool.demo.domain.PhotoInfo;

public interface PhotoService {

    /**
     * @Description //保存图片
     * @Param [photo]
     * @Author oneTi
     * @Date 16:53 2018/8/14
     * @Return com.dcool.demo.domain.PhotoInfo
     **/
    PhotoInfo uploadPhoto(PhotoInfo photo);
}
