package com.example.BooksShop.service;

import com.example.BooksShop.dao.ProductDao;
import com.example.BooksShop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private static ProductDao productDao;

    public static Product saveProduct(Product product) {
        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Product title is required.");
        }

        return productDao.save(product);
    }

    public static Product findProductByTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Product title is required.");
        } else {
            return productDao.findProductByTitle(title);
        }
    }
}
