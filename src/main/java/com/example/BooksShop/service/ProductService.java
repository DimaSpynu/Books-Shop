package com.example.BooksShop.service;

import com.example.BooksShop.dao.ProductRepository;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@AllArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public Product createProduct(ProductDTO dto) {
        return productRepository.save(Product.builder()
                .price(dto.getPrice())
                .title(dto.getTitle())
                .build());
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }


    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
