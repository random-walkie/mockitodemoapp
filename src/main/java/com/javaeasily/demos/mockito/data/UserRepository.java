package com.javaeasily.demos.mockito.data;

import com.javaeasily.demos.mockito.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> users = new HashMap<String, User>();

    public UserRepository() {
        users.put("matt", new User("matt", "letmein"));
        users.put("john", new User("john", "myPassword"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
