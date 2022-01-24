package com.example.springbackend.repository;

import com.example.springbackend.model.Human;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HumanRepository extends JpaRepository<Human, Integer> {
    Human save(Human human);

    Optional<Human> findById(Integer id);

    List<Human> findAll();

    void deleteById(Integer id);

    void delete(Human entity);
}
