package com.example.demo.service;

import com.example.demo.dto.request.userRequest;
import com.example.demo.enity.User;

import java.util.List;


public interface UserService {
    userRequest getOne(Long id);
    List<userRequest> getAll(User user);
    userRequest addUser( User user);
    userRequest updateUser(Long id , User user);
    userRequest deleteUser(Long id );
}
