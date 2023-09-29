package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Contacts;
import com.example.BooksShop.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contacts")
@AllArgsConstructor
public class ContactsController {
    private final ContactService contactService;

    @GetMapping("")
    public String getAllContacts(Model model) {
        List<Contacts> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contact-list";
    }

    @GetMapping("/{id}")
    public Contacts getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @PostMapping
    public Contacts saveContact(@RequestBody Contacts contacts) {
        return contactService.saveContact(contacts);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
