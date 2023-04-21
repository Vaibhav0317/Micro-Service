package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

        @GetMapping("/user/{id}")
        public List<Contact> getContacts(@PathVariable("id") int id)
        {
            return this.contactService.getContactsOfUser(id);
        }

}
