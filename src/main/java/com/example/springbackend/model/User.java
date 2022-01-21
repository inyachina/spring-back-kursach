package com.example.springbackend.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@Table(name = "\"user\"")

public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @NonNull
    @Column(nullable = false)
    private String login;

    @NonNull
    @Column(nullable = false)
    private String password;

    @NonNull
    @Column(nullable = false)
    private String phone;

    @NonNull
    @Column(nullable = false)
    private String email;

    private int humanId;
}