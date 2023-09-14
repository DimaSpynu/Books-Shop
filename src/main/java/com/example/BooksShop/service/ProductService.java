package com.example.BooksShop.service;

import com.example.BooksShop.dao.CategoryRepository;
import com.example.BooksShop.dao.ProductRepository;
import com.example.BooksShop.domain.Categories;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;
    private final CategoryService categoryService;



    public Product createProduct(ProductDTO dto) {
        return productRepository.save(Product.builder()
                .price(dto.getPrice())
                .title(dto.getTitle())
                .categories(categoryService.readById(dto.getCategoryId()))
                .build());
    }

    public List<Product> readByCategoryId(Long id) {
        return productRepository.findByCategoryId(id);

    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }


    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
