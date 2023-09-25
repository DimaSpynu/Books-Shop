package com.example.BooksShop.service;

import com.example.BooksShop.dao.BucketRepository;
import com.example.BooksShop.dao.ProductRepository;
import com.example.BooksShop.domain.Bucket;
import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@Builder
@AllArgsConstructor
public class BucketService {


    private final BucketRepository bucketRepository;

    private final ProductService productService;


    public void addProductToBucket(int productId) {
        Bucket bucket = new Bucket();
        bucket.setProduct(productService.getProductById(productId));
        bucketRepository.save(bucket);
    }

    public void removeProductFromBucket(int productId) {
        bucketRepository.deleteById((long) productId);
    }

    public List<Bucket> readAll() {
        return bucketRepository.findAll();
    }

    public Product update(Product product) {
        return productService.update(product);
    }

    public void delete(Long id) {
        bucketRepository.deleteById(id);
    }
}

