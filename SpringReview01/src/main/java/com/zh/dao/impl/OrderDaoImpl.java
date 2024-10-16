package com.zh.dao.impl;

import com.zh.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao Save()  is running");
    }
}
