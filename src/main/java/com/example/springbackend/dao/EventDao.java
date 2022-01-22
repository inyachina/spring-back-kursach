package com.example.springbackend.dao;

import lombok.Data;
import org.springframework.lang.Nullable;


@Data
public class EventDao {
    String name;
    String description;
    double startTime;
    @Nullable
    double endTime;
}
