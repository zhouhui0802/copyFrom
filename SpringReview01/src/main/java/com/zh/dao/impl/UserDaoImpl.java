package com.zh.dao.impl;

import com.zh.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao is running");
    }
}
