package com.zh.service.impl;

import com.zh.dao.BookDao;
import com.zh.dao.UserDao;
import com.zh.service.BookService;
import com.zh.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService , InitializingBean, DisposableBean {

    private BookDao bookDao;

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {

        System.out.println("set BookDao...");
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        userDao.save();
        System.out.println("BookService中save()方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
