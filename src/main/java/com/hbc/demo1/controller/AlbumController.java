package com.hbc.demo1.controller;

import com.hbc.demo1.entity.Album;
import com.hbc.demo1.service.ALbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/album")
@SpringBootApplication
public class AlbumController {
    @Autowired
    private ALbumService aLbumService;

    @RequestMapping("/getById")
    @ResponseBody
    public Album getById(Integer id){
        return aLbumService.getById(1);
    }
}
