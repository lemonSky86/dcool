package com.dcool.demo.service;

import com.dcool.demo.domain.PhotoInfo;
import com.dcool.demo.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author oneTi
 * @Date 2018/8/1416:40
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    PhotoRepository photoService;

    public PhotoInfo uploadPhoto(PhotoInfo photoInfo){
        return photoService.save(photoInfo);
    }
}
