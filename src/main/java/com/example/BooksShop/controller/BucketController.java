package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Bucket;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.UserDTO;
import com.example.BooksShop.service.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RequestMapping("/bucket")
@Controller
public class BucketController {

    private BucketService bucketService;




}

