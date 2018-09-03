package com.dcool.demo.service;

import com.dcool.demo.domain.TopicInfo;

import java.util.List;

public interface TopicService {

    /**
      * @Description //根据agree查找Top10
      * @Param
      * @Author oneTi
      * @Date 14:58 2018/8/31
      * @Return
      **/
    List<TopicInfo> findTopTenByAgreeDesc();

    /**
      * @Description //保存
      * @Param
      * @Author oneTi
      * @Date 15:03 2018/8/31
      * @Return
      **/
    void save(TopicInfo topicInfo);
}
