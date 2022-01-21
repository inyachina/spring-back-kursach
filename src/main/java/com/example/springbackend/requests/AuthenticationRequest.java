package com.example.springbackend.requests;

import lombok.Data;
import lombok.NonNull;

@Data
public class AuthenticationRequest {
    @NonNull
    private String login;
    @NonNull
    private String password;
}
