package com.example.BooksShop.controller;

import com.example.BooksShop.dao.UserDao;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.service.UserService;
import com.example.BooksShop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @PostMapping("/addNewUser")
    public User addNewUser(@RequestBody User user){
    return UserService

    }
}
