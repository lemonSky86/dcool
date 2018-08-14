package com.dcool.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: TODO
 * @Author oneTi
 * @Date 2018/8/1016:09
 */
public class BaseController {

    @Autowired
    protected HttpServletRequest request;
//    protected HttpServletResponse response;

}
