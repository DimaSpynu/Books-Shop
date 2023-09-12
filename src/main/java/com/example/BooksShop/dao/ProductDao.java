package com.example.BooksShop.dao;

import com.example.BooksShop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
    Product findProductByTitle(String title);
}
