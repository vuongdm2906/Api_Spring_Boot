package com.example.demo.mapper;

import com.example.demo.dto.request.userRequest;
import com.example.demo.enity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper  {
    userRequest getUserById (long id);
    List<userRequest> getAll(User user);
    userRequest addUser( User user);
    userRequest updateUser(Long id , User user);
    userRequest deleteUser(Long id );

}
