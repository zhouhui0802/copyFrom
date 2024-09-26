package com.zh.service.impl;

import com.zh.dao.BookDao;
import com.zh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation=Propagation.REQUIRES_NEW)
    public void buyBook(Integer userId, Integer bookId) {

        Integer price=bookDao.getPriceByBookId(bookId);

        bookDao.updateStock(bookId);

        bookDao.updateBalance(userId,price);
    }
}
