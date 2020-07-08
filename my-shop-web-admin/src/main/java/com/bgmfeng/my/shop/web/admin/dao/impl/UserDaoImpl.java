package com.bgmfeng.my.shop.web.admin.dao.impl;

import com.bgmfeng.my.shop.domain.User;
import com.bgmfeng.my.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserDaoImpl.java
 * @ Time    : 2020/7/8 1:34
 */

@Repository
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public User getUser(String email, String password) {

        logger.debug("调用 getUser()， 参数为：email:{} password:{}",email, password);
        User user = null;
        if ("admin@gmail.com".equals(email)) {
            if ("admin".equals(password)) {
                user  = new User();
                user.setEmail("admin@gmail.com");
                user.setUsername("admin");
                logger.info("成功获取\"{}\" 的用户信息",user.getUsername());
            }
        }else {
            logger.warn("获取\"{}\" 的用户的信息失败",email);
        }
        return user;
    }
}
