package com.zh.controller;

import com.zh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("username="+username+": password="+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParamByServletAPI(@RequestParam(value="username") String username,
                                       String password,
                                       @RequestHeader("referer") String referer,
                                       @CookieValue("JSESSIONID") String jsessionid){

        System.out.println("username:="+username+":"+"password:="+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
