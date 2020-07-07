package com.example.springshell;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public UserService(){
        users.put("alex", new User("alex","Alex"));
        users.put("bob", new User("bob", "Bob"));
    }

    public User findUser(String id){
        return users.get(id);
    }
}
