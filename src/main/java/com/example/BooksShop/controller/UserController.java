package com.example.BooksShop.controller;

import com.example.BooksShop.domain.User;
import com.example.BooksShop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/addNewUser")
    public User addNewUser(@RequestBody User user){
    return UserServiceImpl.saveUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam Long userId){
        return UserServiceImpl.findUserById(userId);
    }

}
