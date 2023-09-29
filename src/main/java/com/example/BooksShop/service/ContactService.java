package com.example.BooksShop.service;

import com.example.BooksShop.domain.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    List<Contacts> getAllContacts();
    Contacts getContactById(Long id);
    Contacts saveContact(Contacts contacts);
    void deleteContact(Long id);

}
