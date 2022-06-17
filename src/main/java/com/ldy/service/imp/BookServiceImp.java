package com.ldy.service.imp;

import com.ldy.dao.BookDao;
import com.ldy.dao.imp.BookDaoImp;
import com.ldy.service.BookService;

/**
 * @author : ldy
 * @version : 1.0
 */
public class BookServiceImp implements BookService {
    BookDao bookDao = new BookDaoImp();
    @Override
    public void save(){
        System.out.println("Book service save");
        bookDao.save();
    }
}
