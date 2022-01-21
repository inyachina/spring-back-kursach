package com.example.springbackend.requests;

import lombok.Data;
import lombok.NonNull;

@Data
public class AuthorizationRequest {
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
