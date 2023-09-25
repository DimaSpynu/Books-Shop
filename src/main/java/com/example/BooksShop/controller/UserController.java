package com.example.BooksShop.controller;

import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.UserDTO;
import com.example.BooksShop.dto.UserRegistrationDTO;
import com.example.BooksShop.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@AllArgsConstructor
public class UserController {


    private UserServiceImpl userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        return new ResponseEntity<>(userService.createUser(dto), HttpStatus.OK); //Протестирован в Postman(работает)
    }


    @GetMapping("/getUserList")
    public ResponseEntity<List<User>> readAll() {
        return new ResponseEntity<>(userService.readAll(), HttpStatus.OK); //Протестирован в Postman(работает)
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> update(@RequestBody User user) {
        return new ResponseEntity<>(userService.update(user), HttpStatus.OK); //Протестирован в Postman(работает)
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) { //Протестирован в Postman(работает)
        userService.delete(id);
        return HttpStatus.OK;
    }
}
