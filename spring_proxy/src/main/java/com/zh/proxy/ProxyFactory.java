package com.zh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxy(){
        ClassLoader classLoader=this.getClass().getClassLoader();
        Class<?>[] interfaces=target.getClass().getInterfaces();

        InvocationHandler h=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("日志  方法："+method.getName()+"参数值： "+ Arrays.toString(args));
                Object result=method.invoke(target,args);
                System.out.println("日志 方法： "+method.getName()+"结果: "+result);
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
