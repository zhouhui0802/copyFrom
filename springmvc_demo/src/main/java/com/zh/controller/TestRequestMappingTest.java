package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestRequestMappingTest {

    @RequestMapping("/")
    public String protal(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
