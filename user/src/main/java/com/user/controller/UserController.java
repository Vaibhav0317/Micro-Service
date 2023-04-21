package com.user.controller;

import com.user.entity.User;
import com.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //object of restTemplate
    @Autowired
    private RestTemplate restTemplate;


    //API to get user by its id
    @GetMapping("/{id}")
    public User getuser(@PathVariable("id") Long id)
    {
        User user=this.userService.getuser(id);
        //System.out.println("u>==="+u);
        //localhost:9002/contact/user/1111
        List contact = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getId(), List.class);

        user.setContact(contact);
        return user;
    }

    //API to get all the user
    @GetMapping("/getAll")
    public List<User> getAllUser ()
    {
        return this.userService.getAllUsers();
    }

}
