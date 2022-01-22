package com.example.springbackend.repository;

import com.example.springbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);

    User save(User user);
}
