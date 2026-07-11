package com.jvlcode.springbootdemo.controller;

import java.util.*;

import com.jvlcode.springbootdemo.entity.UserEntity;
import com.jvlcode.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvlcode.springbootdemo.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
