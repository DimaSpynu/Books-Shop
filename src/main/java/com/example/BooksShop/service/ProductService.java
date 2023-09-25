package com.example.BooksShop.service;

import com.example.BooksShop.dao.ProductRepository;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;
    private final CategoryService categoryService;


    public Product createProduct(ProductDTO dto) {
        return productRepository.save(Product.builder()
                .title(dto.getTitle())
                .price(dto.getPrice())
                .category(categoryService.readById(dto.getCategoryId()))
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

    public Product readById(Long id) {
        return productRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Product not found - " + id));
    }

    public Product getProductById(int productId) {
        return productRepository.findById((long) productId).orElseThrow(() ->
                new RuntimeException("Product not found - " + productId));
    }
}
