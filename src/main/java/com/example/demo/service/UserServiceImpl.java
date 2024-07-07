package com.example.demo.service;

import com.example.demo.dto.request.userRequest;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   final UserMapper userMapper;

    @Override
    public userRequest getOne(Long id) {
        return userMapper.getUserById(id);
    }
}
