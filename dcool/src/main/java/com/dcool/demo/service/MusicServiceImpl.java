package com.dcool.demo.service;

import com.dcool.demo.domain.MusicInfo;
import com.dcool.demo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @Author oneTi
 * @Date 2018/8/2116:05
 */
@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicRepository musicRepository;

    public MusicInfo uploadMusic(MusicInfo musicInfo){
        if(musicInfo != null)
        {
            musicRepository.save(musicInfo);
        }
        return null;
    }

    @Override
    public MusicInfo findLatestMusicInfo() {
        return musicRepository.findFirstByOrderByDateDesc();
    }

    @Override
    public List<MusicInfo> findMusicInfoByUserId(Integer userId) {
        return musicRepository.findMusicInfoByToUser_Id(userId);
    }

    @Override
    public List<MusicInfo> findTopFiveMusicInfoByDate() {
        return musicRepository.findTop5ByDateNotNull();
    }
}
