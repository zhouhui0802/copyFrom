package com.zh.factory;

import com.zh.dao.OrderDao;
import com.zh.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {

    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
