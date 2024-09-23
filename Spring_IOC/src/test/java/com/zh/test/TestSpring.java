package com.zh.test;

import com.zh.pojo.Clazz;
import com.zh.pojo.HelloWorld;
import com.zh.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testSpring(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld=(HelloWorld) ioc.getBean("springOne");

        helloWorld.say();
    }

    @Test
    public void testStudent(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student=(Student)ioc.getBean("StudentOne");

        System.out.println(student);
    }

    @Test
    public void testStudent2(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext1.xml");

        Student student=(Student)ioc.getBean("studentTwo", Student.class);

        System.out.println(student);
    }

    @Test
    public void testStudent3(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student=(Student)ioc.getBean("studentFour", Student.class);

        System.out.println(student);
    }

    @Test
    public void testStudent4(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student=(Student)ioc.getBean("studentThree", Student.class);

        System.out.println(student);
    }

    @Test
    public void testStudent5(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student=(Student)ioc.getBean("studentFive", Student.class);

        System.out.println(student);
    }

    @Test
    public void testStudent6(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

        Clazz clazz=(Clazz)ioc.getBean("clazzOne", Clazz.class);

        System.out.println(clazz);
    }

}
