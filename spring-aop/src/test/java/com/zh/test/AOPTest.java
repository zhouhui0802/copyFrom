package com.zh.test;

import com.zh.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");

        Calculator calculator=ioc.getBean(Calculator.class);

        calculator.add(1,2);
    }

    @Test
    public void test1(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-xml.xml");

        Calculator calculator=ioc.getBean(Calculator.class);

        calculator.add(1,2);
    }
}
