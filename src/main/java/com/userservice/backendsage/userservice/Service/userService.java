package com.userservice.backendsage.userservice.Service;

import com.userservice.backendsage.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("SelfUserService")
public class userService implements userInterface{
    @Autowired
    RestTemplate restTemplate;


    @Override
    public User getUserById(int id) {
        User user = null;
        System.out.println("user id: 1 name ayush"+id);
        return user;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User Register(User user) {
        return null;
    }

    @Override
    public User Logout() {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return List.of();
    }

    @Override
    public User deleteUser(int userId) {
        return null;
    }
}
