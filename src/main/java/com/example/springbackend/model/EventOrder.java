package com.example.springbackend.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table
public class EventOrder {
    @Id
    @GeneratedValue(generator = "increment")
    int id;

    private String status;

    private Date createdDate;

    private Date modifiedDate;

    private int createdBy;

    private int modifiedBy;

    @OneToOne
    private Event event;

    @ManyToMany
    private List<MOR> MORs;
}