package com.example.springbackend.dao;

import lombok.Data;
import lombok.NonNull;

@Data
public class AuthorizationDao {
    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String email;
    @NonNull
    private String phone;
    @NonNull
    private String isEmployee;
}
