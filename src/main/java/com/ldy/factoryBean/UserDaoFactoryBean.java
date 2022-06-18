package com.ldy.factoryBean;

import com.ldy.dao.BookDao;
import com.ldy.dao.UserDao;
import com.ldy.dao.imp.BookDaoImp;
import com.ldy.dao.imp.UserDaoImp;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImp();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {//设置是否为单例
        return true;
    }
}
