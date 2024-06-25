package com.jnuit5.test.jnit5.services;

import org.springframework.stereotype.Service;

import com.jnuit5.test.jnit5.dao.UserRepo;
import com.jnuit5.test.jnit5.models.User;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
    public String saveUser(User user) {
        return userRepo.createUser(user);
    }

    public String findName(int id) {
        return userRepo.findNameById(id);
    }

    public String findEmail(int id) {
        return userRepo.findEmailById(id);
    }
}
