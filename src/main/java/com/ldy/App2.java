package com.ldy;

import com.ldy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ldy
 * @version : 1.0
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookservice = (BookService) applicationContext.getBean("bookservice");
        bookservice.save();
    }
}
