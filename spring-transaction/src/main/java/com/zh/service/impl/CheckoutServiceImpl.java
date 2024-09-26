package com.zh.service.impl;

import com.zh.service.BookService;
import com.zh.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {


    @Autowired
    private BookService bookService;

    @Override
    public void checkout(Integer userId, Integer[] bookIds) {
        for(Integer bookId:bookIds){
            bookService.buyBook(userId,bookId);
        }
    }
}
