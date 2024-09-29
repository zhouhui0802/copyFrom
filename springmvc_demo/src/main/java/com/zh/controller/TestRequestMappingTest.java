package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestRequestMappingTest {

    @RequestMapping("/")
    public String protal(){
        return "index";
    }

    @RequestMapping(
            value={"/hello","/abc"},
            method= {RequestMethod.POST,RequestMethod.GET},
            params={"username"})
    public String hello(){
        return "success";
    }
}
