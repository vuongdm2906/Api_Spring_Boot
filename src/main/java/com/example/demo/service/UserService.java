package com.example.demo.service;

import com.example.demo.dto.request.userRequest;


public interface UserService {
    userRequest getOne(Long id);
}
