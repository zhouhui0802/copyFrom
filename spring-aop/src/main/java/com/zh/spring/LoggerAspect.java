package com.zh.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {

    @Pointcut("execution(* com.zh.spring.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before("execution(public int com.zh.spring.CalculatorImpl.add(int,int))")
    public void beforeAdviceMethod1(){
        System.out.println("LoggerAspect1 前置通知");
    }

    @Before("execution(* com.zh.spring.CalculatorImpl.*(..))")
    public void beforeAdviceMethod2(JoinPoint joinPoint){

        Signature signature=joinPoint.getSignature();
        Object args[]=joinPoint.getArgs();
        System.out.println("LoggerAspect 方法："+signature.getName()+"参数："+ Arrays.toString(args));
    }

    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){

        Signature signature=joinPoint.getSignature();
        Object args[]=joinPoint.getArgs();
        System.out.println("LoggerAspect new 方法："+signature.getName()+"new 参数："+ Arrays.toString(args));
    }
}
