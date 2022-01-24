package com.example.springbackend.service;

import com.example.springbackend.model.Event;
import com.example.springbackend.model.Human;
import com.example.springbackend.model.HumanOrder;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface HumanService {
    HumanOrder save(HumanOrder order);

    Optional<HumanOrder> findById(Integer id);

    List<HumanOrder> findAll();

    List<HumanOrder> findAllByStatus(String status);

    void deleteById(Integer id);

    void delete(HumanOrder order);
}
