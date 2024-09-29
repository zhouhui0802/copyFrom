package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/abc/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id+"username: "+username);
        return "success";
    }
}
