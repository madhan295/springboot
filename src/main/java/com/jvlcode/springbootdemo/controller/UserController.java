package com.jvlcode.springbootdemo.controller;

import java.util.*;

import com.jvlcode.springbootdemo.entity.UserEntity;
import com.jvlcode.springbootdemo.exception.ResourceNotFoundException;
import com.jvlcode.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.jvlcode.springbootdemo.model.User;

import static com.jvlcode.springbootdemo.repository.UserRepository.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
       return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found with this id:" + id));
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@RequestBody UserEntity user, @PathVariable Long id) {
        UserEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        userData.setName(user.getName());
        return userRepository.save(userData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        UserEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        userRepository.delete(userData);
        return ResponseEntity.ok().build();
    }
}
