package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){

        ModelAndView mav=new ModelAndView();
        mav.addObject("testRequestScope","hello world");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){

        model.addAttribute("testRequestScope","hello world");
        return "success";
    }

    @RequestMapping("/test/modelMap")
    public String testModelMap(ModelMap modelMap){

        modelMap.addAttribute("testRequestScope","hello world");
        return "success";
    }

    @RequestMapping("/test/map")
    public String testmap(Map<String,Object> map){

        map.put("testRequestScope","hello map");
        return "success";
    }
}
