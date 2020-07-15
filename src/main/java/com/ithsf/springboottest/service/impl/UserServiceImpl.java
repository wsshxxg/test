package com.ithsf.springboottest.service.impl;

import com.ithsf.springboottest.dao.UserDao;
import com.ithsf.springboottest.domain.User;
import com.ithsf.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserInfoByUserName(String userName) {
        User user = new User();
        user.setUsername(userName);
        List<User> users = userDao.select(user);
        if(CollectionUtils.isEmpty(users)){
            return null;
        }else {
            return users.get(0);
        }
    }
}
