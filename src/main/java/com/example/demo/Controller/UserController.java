package com.example.demo.Controller;

import com.example.demo.dto.request.userRequest;
import com.example.demo.dto.request.userUpdateRequest;
import com.example.demo.enity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserId(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(userService.getOne(userId));


    }
}
