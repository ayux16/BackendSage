package com.userservice.backendsage.userservice.Service;

import com.userservice.backendsage.userservice.model.User;

import java.util.List;

public interface userInterface {
    User getUserById(int id);
    User login(String username, String password);
    User Register(User user);
    User Logout();
    List<User> getAllUser();
    User deleteUser(int userId);
}
