package com.dcool.demo.service;

import com.dcool.demo.domain.MusicInfo;

import java.util.List;

public interface MusicService {

    /**
     * @Description //保存文件
     * @Param [musicInfo]
     * @Author oneTi
     * @Date 16:18 2018/8/21
     * @Return com.dcool.demo.domain.MusicInfo
     **/
    MusicInfo uploadMusic(MusicInfo musicInfo);

    /**
     * @Description //查找最新文件
     * @Param []
     * @Author oneTi
     * @Date 16:22 2018/8/21
     * @Return java.util.List<com.dcool.demo.domain.MusicInfo>
     **/
    MusicInfo findLatestMusicInfo();

    /**
     * @Description //根据用户Id查找文件
     * @Param [userId]
     * @Author oneTi
     * @Date 16:25 2018/8/21
     * @Return java.util.List<com.dcool.demo.domain.MusicInfo>
     **/
    List<MusicInfo> findMusicInfoByUserId(Integer userId);

    /**
     * @Description //根据时间查询top5数据
     * @Param []
     * @Author oneTi
     * @Date 17:21 2018/8/21
     * @Return java.util.List<com.dcool.demo.domain.MusicInfo>
     **/
    List<MusicInfo> findTopFiveMusicInfoByDate();
}
