package com.example.BooksShop.service;

import com.example.BooksShop.dao.ContactRepository;
import com.example.BooksShop.domain.Contacts;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Override
    public List<Contacts> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contacts getContactById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public Contacts saveContact(Contacts contacts) {

        return contacts;
    }

    @Override
    public void deleteContact(Long id) {

    }
}
