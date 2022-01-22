package com.example.springbackend.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "event_id", nullable = false)
    int id;

    String name;

    String description;

    Date created_date;

    double startTime;

    @Nullable
    double endTime;


    public Event(String name, String description, Date created_date, double startTime, double endTime) {
        this.name = name;
        this.description = description;
        this.created_date = created_date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
