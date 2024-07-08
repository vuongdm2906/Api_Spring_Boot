package com.example.demo.service;

import com.example.demo.dto.request.userRequest;
import com.example.demo.enity.User;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   final UserMapper userMapper;

    @Override
    public userRequest getOne(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<userRequest> getAll(User user) {
        return userMapper.getAll(user);
    }


    @Override
    public userRequest addUser( User user) {
//        user.setId(user.getId());
//        user.setEmail(user.getEmail());
//        user.setUsername(user.getUsername());
//        user.setPassword(user.getPassword());
//        user.setCreated_at(user.getCreated_at());
//        user.setUpdated_at(user.getUpdated_at());
        return  userMapper.addUser(user);
    }

    @Override
    public userRequest updateUser(Long id, User user) {
//        user.setEmail(user.getEmail());
//        user.setUsername(user.getUsername());
//        user.setPassword(user.getPassword());
//        user.setCreated_at(user.getCreated_at());
//        user.setUpdated_at(user.getUpdated_at());
        return userMapper.updateUser(id,user);
    }

    @Override
    public userRequest deleteUser(Long id) {
        return userMapper.deleteUser(id);
    }
}
