package com.example.BooksShop.dao;

import com.example.BooksShop.domain.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
