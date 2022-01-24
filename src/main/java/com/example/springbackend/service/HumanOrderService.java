package com.example.springbackend.service;

import com.example.springbackend.model.Human;

import java.util.List;
import java.util.Optional;

public interface HumanOrderService {
    Human save(Human human);

    Optional<Human> findById(Integer id);

    List<Human> findAll();

    void deleteById(Integer id);

    void delete(Human entity);
}
