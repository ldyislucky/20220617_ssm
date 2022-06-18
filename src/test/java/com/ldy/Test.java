package com.ldy;

import com.ldy.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Test {
  @org.junit.Test
  public void t1(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = (UserDao) applicationContext.getBean("userDao");
    userDao.run();
  }
}
