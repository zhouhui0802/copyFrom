package com.zh.dao.impl;

import com.zh.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    @Override
    public void save() {
        System.out.println("BookDao中save()方法执行");
    }

    public void init(){
        System.out.println("init...");
    }

    public void destory(){
        System.out.println("destory...");
    }
}
