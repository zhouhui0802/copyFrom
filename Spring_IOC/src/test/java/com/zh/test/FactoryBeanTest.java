package com.zh.test;

import com.zh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User user=ioc.getBean(User.class);

        System.out.println(user);
    }
}
