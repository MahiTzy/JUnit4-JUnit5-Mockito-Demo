package com.jnuit5.test.jnit5.dao;

import org.springframework.stereotype.Repository;

import com.jnuit5.test.jnit5.models.User;

@Repository
public class UserRepo {

    public String createUser(User user) {
        System.out.println("User created");
        return "Mohit";
    }

    public String findNameById(int id) {
        System.out.println("User found by id");
        return "Mohit";
    }

    public String findEmailById(int id) {
        System.out.println("Email found by id");
        return "ms@gmail.com";
    }

}
