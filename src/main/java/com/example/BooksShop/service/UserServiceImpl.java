package com.example.BooksShop.service;

import com.example.BooksShop.dao.UserDao;
import com.example.BooksShop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    public User addNewUser(User user) {
        return UserDao
    }

}
