package com.example.springbackend.controller;


import com.example.springbackend.exceptions.UserNotFoundException;
import com.example.springbackend.facade.ErrorBody;
import com.example.springbackend.facade.Response;
import com.example.springbackend.model.User;
import com.example.springbackend.requests.AuthenticationRequest;
import com.example.springbackend.requests.AuthorizationRequest;
import com.example.springbackend.service.impl.UserServiceImpl;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    private UserServiceImpl userService;

    @Autowired
    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @PostMapping("/reg")
    public ResponseEntity<Response<Object>> authorize(@RequestBody @NonNull AuthorizationRequest req) {
        try {
            User user = this.userService.findByLogin(req.getLogin());
            this.userService.saveUser(new User(req.getLogin(), req.getPassword(), req.getLogin(), req.getEmail()));
            return Response.success();
        } catch (Exception e) {
                return Response.failure(
                        Response.error(
                                new ErrorBody(e.getMessage(),
                                        HttpStatus.FORBIDDEN, Arrays.toString(e.getStackTrace()))));
            }
        }

    @GetMapping("/log")
    public ResponseEntity<Response<Object>> authenticate(@RequestBody AuthenticationRequest req) {
        String failureMessage = "";
        try {
            User user = this.userService.findByLogin(req.getLogin());
            if (user.getLogin().equals(req.getLogin())) return Response.success();
        } catch (UserNotFoundException e) {
            failureMessage = Arrays.toString(e.getStackTrace());
        }
        return Response.failure(
                Response.error(
                        new ErrorBody("Неверно указан логин или пароль.",
                                HttpStatus.NOT_FOUND, failureMessage)));
    }


}
