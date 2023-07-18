package com.example.ecomerce.controller;

import com.example.ecomerce.entity.User;
import com.example.ecomerce.service.impl.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/user/save")
    public void saveUser(@RequestBody User user){
        user.setRole("ROLE_USER");
        userService.saveUser(user);
    }

}
