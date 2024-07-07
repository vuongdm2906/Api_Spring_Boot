package com.example.demo.mapper;

import com.example.demo.dto.request.userRequest;
import com.example.demo.enity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper  {
    userRequest getUserById (long id);
}
