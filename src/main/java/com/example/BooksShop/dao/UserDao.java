package com.example.BooksShop.dao;

import com.example.BooksShop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends JpaRepository<User, Long> {


}




