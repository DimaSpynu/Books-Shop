package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Categories;
import com.example.BooksShop.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/categories")
@RestController
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    @GetMapping("/getAllCategoryElements")
    public ResponseEntity<List<Categories>> readAll() {
        return new ResponseEntity<>(categoryService.readAll(), HttpStatus.OK);
    }

}
