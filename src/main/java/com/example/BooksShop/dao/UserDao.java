package com.example.BooksShop.dao;

import com.example.BooksShop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDao extends JpaRepository<User, Long> {

}
