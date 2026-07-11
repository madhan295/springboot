package com.jvlcode.springbootdemo.repository;

import com.jvlcode.springbootdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
