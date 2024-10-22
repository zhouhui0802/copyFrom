package com.zh.service.impl;

import com.zh.dao.LogDao;
import com.zh.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {


    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Integer money) {
        logDao.log("转账从"+out+"到"+in+"账户"+money);
    }
}
