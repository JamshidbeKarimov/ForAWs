package com.example.foraws.controller;

import com.example.foraws.entity.UserEntity;
import com.example.foraws.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/hello")
    public String hello() {
        return "this is from AWS, all of you can access it from anywhere";
    }

    @PostMapping("/user")
    public String addUser(@RequestBody UserEntity user) {
        userRepository.save(user);
        return "user saved";
    }
}
