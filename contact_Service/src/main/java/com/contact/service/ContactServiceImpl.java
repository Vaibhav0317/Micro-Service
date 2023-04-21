package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contact

    static List<Contact> list=new ArrayList<Contact>();
    static {
        list.add(new Contact(1,"amit@gmail.com","Amit",1111));
        list.add(new Contact(2,"anil@gmail.com","Anil",1111));
        list.add(new Contact(3,"rohan@gmail.com","Rohan",1112));
        list.add(new Contact(2,"sameer@gmail.com","Sameer",1113));
        // System.out.println("static list>=="+list);
    }


    @Override
    public List<Contact> getContactsOfUser(int userId) {
        return list.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
    }
}
