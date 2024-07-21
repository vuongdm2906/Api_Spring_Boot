package com.example.demo.Controller;

import com.example.demo.dto.request.PagingRequest;
import com.example.demo.dto.request.userRequest;
import com.example.demo.dto.request.userUpdateRequest;
import com.example.demo.enity.Paging;
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @GetMapping("{userId}")
    public ResponseEntity<?> getUserId(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(userService.getOne(userId));
    }
//    @GetMapping("list")
//    public ResponseEntity<?> getAll( @RequestBody User user ){
//        return ResponseEntity.ok(userService.getAll(user));
//    }

    @PostMapping("add")
    public ResponseEntity<?> addUser( @RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }

    @PutMapping("update/{userId}")
    public ResponseEntity<?> updateUser( @PathVariable("userId") Long id  ,  @RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(id,user));
    }

    @PostMapping("/paging")
    public ResponseEntity<PagingRequest<userRequest>> getAll(@RequestBody Paging paging) {
        PagingRequest<userRequest> response = userService.getAll(paging);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") Long id  ){
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
