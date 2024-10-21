package com.zh.dao.impl;

import com.zh.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        Long startTime=System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            System.out.println("save execute...");
        }

        Long endTime=System.currentTimeMillis();


        Long totalTime=endTime-startTime;

        System.out.println("执行消耗的时间："+totalTime+"ms");
    }

    @Override
    public void update() {
        System.out.println("update execute");
    }


}
