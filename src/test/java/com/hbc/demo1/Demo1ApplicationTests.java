package com.hbc.demo1;

import com.hbc.demo1.dao.AlbumMapper;
import com.hbc.demo1.dao.GuruDao;
import com.hbc.demo1.service.GuruService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
    private GuruService guruService;
    @Autowired
    private GuruDao guruDao;
    @Autowired
    private AlbumMapper albumMapper;
    @Test
    public void contextLoads() {
        System.out.println(guruService.getAll());
//        System.out.println(guruDao.selectAll());
    }
    @Test
    public void testMBG(){
        System.out.println(albumMapper.selectByPrimaryKey(1));
    }

}
