package com.zh.controller;

import com.zh.service.BookService;
import com.zh.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }


    public void checkout(Integer userId,Integer[] bookIds){
         checkoutService.checkout(userId,bookIds);
    }
}
