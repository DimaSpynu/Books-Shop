package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Category;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;
import com.example.BooksShop.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/categories")
@RestController
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/getAllCategoryElements")
    public ResponseEntity<List<Category>> readAll() {
        return new ResponseEntity<>(categoryService.readAll(), HttpStatus.OK); //Протестирован в Postman(работает)
    }

    @PostMapping("/createNewCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody Product product) { //Протестирован в Postman(работает)
        return categoryService.createNewCategory(product);
    }
}
