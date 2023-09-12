package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDto;
import com.example.BooksShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    Product addNewProduct(@RequestBody ProductDto productDto) {
        Product product = new Product();
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());

        return ProductService.saveProduct(product);
    }
    @GetMapping("/getProduct")
    Product getProduct(@RequestBody Product product) {
        return ProductService.findProductByTitle(product.getTitle());
    }

}
