package com.ldy;

import com.ldy.service.imp.BookServiceImp;

/**
 * @author : ldy
 * @version : 1.0
 */
public class App {
    public static void main(String[] args) {
        BookServiceImp bookServiceImp = new BookServiceImp();
        bookServiceImp.save();
    }
}
