package com.ithsf.springboottest.controller;

import com.ithsf.springboottest.domain.User;
import com.ithsf.springboottest.service.UserService;
import com.ithsf.springboottest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{username}")
    public User getUserInfoByUserName(@PathVariable("username") String userName){

        User user = userService.getUserInfoByUserName(userName);
        return  user;
    }
}
