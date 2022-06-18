package com.ldy.service.imp;

import com.ldy.dao.BookDao;
import com.ldy.service.BookService;

/**
 * @author : ldy
 * @version : 1.0
 */
public class BookServiceImp implements BookService {


    private BookDao bd;
    @Override
    public void save(){
        System.out.println("Book service save");
        bd.save();
    }
    public void setBd(BookDao bda) {
        this.bd = bda;
    }


}
