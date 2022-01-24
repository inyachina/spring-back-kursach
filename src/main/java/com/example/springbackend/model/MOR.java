package com.example.springbackend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class MOR {

    @Id
    @GeneratedValue(generator = "increment")
    int id;

    float successPercent;

    private String description;

    private Date createdDate;

    private Date modifiedDate;

    private int createdBy;

    private int modifiedBy;

    @ManyToMany
    private List<Event> events;
}
