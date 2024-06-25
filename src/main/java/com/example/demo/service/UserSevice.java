package com.example.demo.service;

import com.example.demo.dto.request.userRequest;
import com.example.demo.dto.request.userUpdateRequest;
import com.example.demo.enity.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevice {
    @Autowired
    private UserRepo userRepo;

    public User create(userRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());

        user.setFirstName(request.getFirstName());

        user.setPassword(request.getPassword());

        user.setDob(request.getDob());


        return userRepo.save(user);
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User getUser(String id) {

        return userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(String id, userUpdateRequest request) {

        User user = getUser(id);
        user.setPassword(request.getPassword());
        user.setDob(request.getDob());

        return userRepo.save(user);
    }

    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
