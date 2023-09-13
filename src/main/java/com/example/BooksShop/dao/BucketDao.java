package com.example.BooksShop.dao;

import com.example.BooksShop.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketDao extends JpaRepository<Bucket, Long> {
}
