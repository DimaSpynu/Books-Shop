package com.example.BooksShop.service;

import com.example.BooksShop.dao.CategoryRepository;
import com.example.BooksShop.domain.Categories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Categories> readAll() {
        return categoryRepository.findAll();
    }

    public Categories readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id));
    }
}
