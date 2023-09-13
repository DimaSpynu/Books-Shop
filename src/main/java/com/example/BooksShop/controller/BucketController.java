package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Bucket;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.service.BucketService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bucket")
@Controller
public class BucketController {

    private BucketService bucketService;

    @PostMapping("/addProduct")
    public ResponseEntity addProductToBucket(@PathVariable Long bucketId, @RequestBody Product product) {
        Bucket updatedBucket = bucketService.addProductToBucket(bucketId, product);
        return ResponseEntity.ok(updatedBucket);
    }
}

