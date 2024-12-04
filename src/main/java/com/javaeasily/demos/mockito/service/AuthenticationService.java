package com.javaeasily.demos.mockito.service;

import com.javaeasily.demos.mockito.User;
import com.javaeasily.demos.mockito.data.UserRepository;

public class AuthenticationService {
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user.getPassword().equals(password); // this is just for demonstration purposes, of course.
    }
}
