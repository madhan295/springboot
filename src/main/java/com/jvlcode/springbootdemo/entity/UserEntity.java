package com.jvlcode.springbootdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public UserEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserEntity() {
        super();
    }
}
