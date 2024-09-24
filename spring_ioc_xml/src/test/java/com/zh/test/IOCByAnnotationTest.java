package com.zh.test;

import com.zh.controller.UserController;
import com.zh.dao.UserDao;
import com.zh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {

    @Test
    public void test(){

        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");

        UserController userController=ioc.getBean(UserController.class);
        System.out.println(userController);

        UserService userService=ioc.getBean(UserService.class);
        System.out.println(userService);

        UserDao userDao=ioc.getBean(UserDao.class);
        System.out.println(userDao);
    }

    @Test
    public void test1(){

        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");

        UserController userController=ioc.getBean("userController",UserController.class);

        userController.saveUser();
    }
}
