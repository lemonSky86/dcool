package com.dcool.demo.repository;

import com.dcool.demo.domain.MusicInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<MusicInfo, Long> {

    /**
     * @Description //根据用户id查找
     * @Param [userId]
     * @Author oneTi
     * @Date 16:10 2018/8/21
     * @Return com.dcool.demo.domain.MusicInfo
     **/
    List<MusicInfo> findMusicInfoByToUser_Id(Integer userId);

    /**
     * @Description //根据时间查找最新一条数据
     * @Param []
     * @Author oneTi
     * @Date 16:14 2018/8/21
     * @Return com.dcool.demo.domain.MusicInfo
     **/
    List<MusicInfo> findMusicInfoByDateOrderByDateDateDesc();

    /**
     * @Description //根据时间查找Top5数据
     * @Param []
     * @Author oneTi
     * @Date 17:19 2018/8/21
     * @Return java.util.List<com.dcool.demo.domain.MusicInfo>
     **/
    List<MusicInfo> findTop5ByDate();
}
