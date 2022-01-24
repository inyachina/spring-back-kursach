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

    private String login;

    private String password;

    private String phone;

    private String email;

    private boolean isEmployee;

    public User() {

    }

    public User(@NonNull String login, @NonNull String password, @NonNull String phone, @NonNull String email,@NonNull boolean isEmployee) {
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.isEmployee = isEmployee;
    }

}