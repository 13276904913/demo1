package com.hbc.demo1.service.impl;

import com.hbc.demo1.dao.AlbumMapper;
import com.hbc.demo1.entity.Album;
import com.hbc.demo1.service.ALbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements ALbumService {
    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public Album getById(Integer id) {
        return albumMapper.selectByPrimaryKey(id);
    }
}
