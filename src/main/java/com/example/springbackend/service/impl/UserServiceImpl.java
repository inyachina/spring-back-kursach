package com.example.springbackend.service.impl;

import com.example.springbackend.exceptions.UserNotFoundException;
import com.example.springbackend.model.User;
import com.example.springbackend.repository.UserRepository;
import com.example.springbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findByLogin(String login) throws UserNotFoundException {
        return this.userRepository.findByLogin(login);
    }

    @Override
    public User findByUserId(Long id) {
        return null;
    }

    @Override
    public User findByRefreshToken(String refreshToken) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User saveUser(User user){
        return this.userRepository.save(user);
    }

    @Override
    public User getCurrentUser() {
        return null;
    }

    public List<User> getAll() {
        return this.userRepository.findAll();
    }
}