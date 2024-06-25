package com.example.demo.Controller;

import com.example.demo.dto.request.userRequest;
import com.example.demo.dto.request.userUpdateRequest;
import com.example.demo.enity.User;
import com.example.demo.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserSevice userSevice;

    @PostMapping("/add")
    User createUser(@RequestBody userRequest request){
            return  userSevice.create(request);
    }

    @GetMapping("/all")
    List<User> getAll(){
        return userSevice.getAll();
    }

    @GetMapping("/{id}")
    User getUser (@PathVariable("id") String id){
        return userSevice.getUser(id);
    }

    @PostMapping("/{id}")
    User getUpdate(@PathVariable String id , @RequestBody userUpdateRequest request){

        return userSevice.updateUser(id,request);
    }

    @DeleteMapping("/{id}")
    String  deleteUser(@PathVariable String id){
     userSevice.deleteUser(id);
     return "User has been deleted";
    }
}
