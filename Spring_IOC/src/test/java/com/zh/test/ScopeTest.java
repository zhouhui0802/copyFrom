package com.zh.test;

import com.zh.pojo.Student;
import com.zh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void testScope(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1=ioc.getBean(Student.class);
        Student student2=ioc.getBean(Student.class);

        System.out.println(student1.equals(student2));

    }

    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user=ioc.getBean(User.class);

        System.out.println(user);
    }

    @Test
    public void test1(){
        ConfigurableApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");


        User user=ioc.getBean(User.class);

        System.out.println(user);

        ioc.close();
    }
}
