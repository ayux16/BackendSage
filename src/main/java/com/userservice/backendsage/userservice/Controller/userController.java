package com.userservice.backendsage.userservice.Controller;

import com.userservice.backendsage.userservice.Service.userInterface;
import com.userservice.backendsage.userservice.Service.userService;
import com.userservice.backendsage.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    private userInterface service;
    public userController(@Qualifier ("SelfUserService") userInterface service) {
        this.service = service;
    }
    @GetMapping("/user/{id}")
    public User getById(@PathVariable int id) {
         User user=service.getUserById(id);
         return user;
    }
}
