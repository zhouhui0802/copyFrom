package com.zh.test;

import com.zh.proxy.Calculator;
import com.zh.proxy.CalculatorImpl;
import com.zh.proxy.CalculatorStaticProxy;
import com.zh.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test(){
        CalculatorStaticProxy calculatorStaticProxy=new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1,2);
    }

    @Test
    public void test1(){
        ProxyFactory proxyFactory=new ProxyFactory(new CalculatorImpl());
        Calculator calculator=(Calculator) proxyFactory.getProxy();
        calculator.add(1,2);
    }
}
