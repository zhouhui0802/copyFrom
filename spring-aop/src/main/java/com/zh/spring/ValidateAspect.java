package com.zh.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {

    @Before("execution(* com.zh.spring.CalculatorImpl.*(..))")
    public void beforeMethod(){
        System.out.println("ValidateAspect->前置通知");
    }
}
