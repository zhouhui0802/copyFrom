package com.zh.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {


    public void pointCut(){}


    public void beforeAdviceMethod1(){
        System.out.println("LoggerAspect1 前置通知");
    }


    public void beforeAdviceMethod2(JoinPoint joinPoint){

        Signature signature=joinPoint.getSignature();
        Object args[]=joinPoint.getArgs();
        System.out.println("LoggerAspect 方法："+signature.getName()+"参数："+ Arrays.toString(args));
    }


    public void beforeAdviceMethod(JoinPoint joinPoint){

        Signature signature=joinPoint.getSignature();
        Object args[]=joinPoint.getArgs();
        System.out.println("LoggerAspect new 方法："+signature.getName()+"new 参数："+ Arrays.toString(args));
    }


    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature=joinPoint.getSignature();

        System.out.println("loggerAspect, 后置通知 方法："+signature.getName()+",执行完毕");
    }


    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        Signature signature=joinPoint.getSignature();

        System.out.println("loggerAspect, 返回通知 方法："+signature.getName()+",执行完毕 结果："+result);
    }


    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable ex){
        Signature signature=joinPoint.getSignature();

        System.out.println("loggerAspect, 返回通知 方法："+signature.getName()+",执行完毕 异常： "+ex);
    }


    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result=null;
        try{
            System.out.println("环绕通知-》前置通知");

            result=joinPoint.proceed();

            System.out.println("环绕通知-》返回通知");
        }catch(Throwable throwable){
            throwable.printStackTrace();
            System.out.println("环绕通知-》异常通知");
        }finally {
            System.out.println("环绕通知-》后置通知");
        }

        return result;
    }
}
