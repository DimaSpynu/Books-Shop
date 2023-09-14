package com.example.BooksShop.dao;

import com.example.BooksShop.domain.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
