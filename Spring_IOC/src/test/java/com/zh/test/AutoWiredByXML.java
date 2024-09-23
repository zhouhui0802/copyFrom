package com.zh.test;

import com.zh.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredByXML {

    @Test
    public void test1(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-autowire-xml.xml");

        UserController userController=ioc.getBean(UserController.class);

        userController.saveUser();
    }

    @Test
    public void test2(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-autowire-xml1.xml");

        UserController userController=ioc.getBean(UserController.class);

        userController.saveUser();
    }
}
