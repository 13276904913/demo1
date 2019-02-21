package com.hbc.demo1.controller;

import com.hbc.demo1.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@RequestMapping("/test")

public class GuruController {
    @Autowired
    private GuruService guruService;

    @RequestMapping("/test")
    public String test(){

        return "index";
    }

}
