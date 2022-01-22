package com.example.springbackend.service;

import com.example.springbackend.exceptions.UserNotFoundException;
import com.example.springbackend.model.User;


public interface UserService {

    User findByLogin(String login) throws UserNotFoundException;

    User saveUser(User user) throws UserNotFoundException;

}
