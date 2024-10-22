package com.zh.service.impl;

import com.zh.dao.AccountDao;
import com.zh.service.AccountService;
import com.zh.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;


    @Override
    public void transfer(String out, String in, Integer money) {

        try{
            accountDao.outMoney(out,money);

            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }

    }
}
