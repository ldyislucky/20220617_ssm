package com.ldy.dao.imp;

import com.ldy.dao.BookDao;

/**
 * @author : ldy
 * @version : 1.0
 */
public class BookDaoImp implements BookDao {
    @Override
    public void save(){
        System.out.println("book dao save");
    }
}
