package com.example.springbackend.service.impl;

import com.example.springbackend.model.Human;
import com.example.springbackend.model.HumanOrder;
import com.example.springbackend.service.HumanOrderService;

import java.util.List;
import java.util.Optional;

public class HumanOrderServiceImpl implements HumanOrderService {
    @Override
    public Human save(Human human) {
        return null;
    }

    @Override
    public Optional<Human> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Human> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void delete(Human entity) {

    }
}
