package com.zh.factory;

import com.zh.dao.UserDao;
import com.zh.dao.impl.UserDaoImpl;

public class UserDaoFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
