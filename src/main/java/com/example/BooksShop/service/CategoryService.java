package com.example.BooksShop.service;

import com.example.BooksShop.dao.CategoryRepository;
import com.example.BooksShop.domain.Category;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    public Category readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id));
    }

    public Category createNewCategory(Product product) {
        Category category = new Category();
        categoryRepository.save(category);
        return category;
    }
}
