package com.jvlcode.springbootdemo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvlcode.springbootdemo.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "madhan", "madd@gmail.com"),
                new User(2L, "robin", "rob@gmail.com"),
                new User(23L, "sanjay", "rob@gasdfasfmail.com"));
    }
}
