package com.example.BooksShop.dao;

import com.example.BooksShop.domain.Bucket;
import com.example.BooksShop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BucketRepository extends JpaRepository<Bucket, Long> {




}
