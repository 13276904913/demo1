package com.hbc.demo1.service.impl;

import com.hbc.demo1.dao.GuruDao;
import com.hbc.demo1.entity.Guru;
import com.hbc.demo1.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuruServiceImpl implements GuruService {
    @Autowired
    private GuruDao guruDao;
    @Override
    public List<Guru> getAll() {
        return guruDao.selectAll();
    }
}
