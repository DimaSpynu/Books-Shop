package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Bucket;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.ProductDTO;
import com.example.BooksShop.dto.UserDTO;
import com.example.BooksShop.service.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/bucket")
@Controller
public class BucketController {
    private BucketService bucketService;
    @PostMapping("/addProductToBucket")
    public String addToBucket(@RequestParam("productId") int productId) {
        bucketService.addProductToBucket(productId);
        return "redirect:/bucket";
    }
    @PostMapping("/removeProductFromBucket")
    public String removeFromBucket(@RequestParam("productId") int productId) {
        bucketService.removeProductFromBucket(productId);
        return "redirect:/bucket";
    }
    @GetMapping("/getAllBucketElements")
    public ResponseEntity<List<Bucket>> readAll() {
        return new ResponseEntity<>(bucketService.readAll(), HttpStatus.OK);
    }
    @PutMapping("/updateProduct")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return new ResponseEntity<>(bucketService.update(product), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        bucketService.delete(id);
    }
}






