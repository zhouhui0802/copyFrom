package com.zh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRestController {

    @RequestMapping(value="/user",method = RequestMethod.GET)
    //@GetMapping("/user")
    public String getAllUser(){
        return "success";
    }

    //@GetMapping("/user/{id}")
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("id="+id);
        return "success";
    }


    //@PostMapping("/user")
    @RequestMapping(value="/user",method = RequestMethod.POST)
    public String insertUser(){
        System.out.println("添加用户信息");
        return "success";
    }


    //@PutMapping("/user")
    @RequestMapping(value="/user",method = RequestMethod.PUT)
    public String updateUser(){
        System.out.println("更新用户信息");
        return "success";
    }

    //@DeleteMapping("/user/{id}")
    @RequestMapping(value="/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息"+id);
        return "success";
    }

}
