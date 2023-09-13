package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Product;
import com.example.BooksShop.domain.User;
import com.example.BooksShop.dto.ProductDTO;
import com.example.BooksShop.dto.UserDTO;
import com.example.BooksShop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<Product> create(@RequestBody ProductDTO dto) {
        return new ResponseEntity<>(productService.createProduct(dto), HttpStatus.OK);
    }

    @GetMapping("/getProductList")
    public ResponseEntity<List<Product>> readAll() {
        return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> update(@RequestBody Product Product) {
        return new ResponseEntity<>(productService.update(Product), HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct")
    public HttpStatus delete(@PathVariable Long id) {
        productService.delete(id);
        return HttpStatus.OK;
    }




}
