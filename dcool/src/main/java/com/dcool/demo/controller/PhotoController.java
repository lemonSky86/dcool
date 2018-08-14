package com.dcool.demo.controller;

import com.dcool.demo.domain.PhotoInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @Author oneTi
 * @Date 2018/8/1416:32
 */
@Controller
public class PhotoController {

    @RequestMapping("/photo/upload")
    public String upload(PhotoInfo photoInfo){
        return null;
    }
}
