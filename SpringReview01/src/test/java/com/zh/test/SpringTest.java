package com.zh.test;

import com.zh.dao.BookDao;
import com.zh.dao.OrderDao;
import com.zh.dao.UserDao;
import com.zh.service.BookService;
import com.zh.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao=(BookDao) ctx.getBean("bookDao");

        bookDao.save();
        System.out.println("-----------");

        BookService bookService=(BookService) ctx.getBean("bookService");
        bookService.save();

        OrderDao orderDao=(OrderDao) ctx.getBean("orderDao");
        orderDao.save();

        UserDao userDao=(UserDao) ctx.getBean("userDao");
        userDao.save();

        System.out.println("--------");
        UserDao userDao1=(UserDao) ctx.getBean("userDaoFactoryBean");
        userDao1.save();

        ctx.close();
    }
}
