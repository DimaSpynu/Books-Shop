package com.example.BooksShop.controller;

import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.UserDTO;
import com.example.BooksShop.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@AllArgsConstructor
public class UserController {


    private final UserServiceImpl userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        return new ResponseEntity<>(userService.createUser(dto), HttpStatus.OK);
    }

    @GetMapping("/getUserList")
    public ResponseEntity<List<User>> readAll() {
        return new ResponseEntity<>(userService.readAll(), HttpStatus.OK);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> update(@RequestBody User user) {
        return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser")
    public HttpStatus delete(@PathVariable Long id) {
        userService.delete(id);
        return HttpStatus.OK;
    }

}
