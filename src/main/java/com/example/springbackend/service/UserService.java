package com.example.springbackend.service;

import com.example.springbackend.exceptions.UserNotFoundException;
import com.example.springbackend.model.User;

import java.util.List;


public interface UserService {

    User findByLogin(String login) throws UserNotFoundException;

    User findByUserId(Long id);

    User findByRefreshToken(String refreshToken);

    void delete(Long id);

    User saveUser(User user) throws UserNotFoundException;

    User getCurrentUser();

    List<User> getAll();
}
