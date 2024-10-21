package com.zh.main;

import com.zh.config.SpringConfig;
import com.zh.dao.BookDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String args[]) throws Exception{




        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao=ctx.getBean(BookDao.class);
        bookDao.save();

    }
}
