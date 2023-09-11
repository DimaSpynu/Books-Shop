package com.example.BooksShop.service;

import com.example.BooksShop.dao.UserDao;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.errors.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private static UserDao userDao;

    public static User saveUser(User user) {
        return userDao.save(new User());
    }

    public static User findUserById(Long userId) {
        return userDao.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("Program with id " + userId + " not found"));
    }






}
