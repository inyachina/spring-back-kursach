package com.example.springbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table
public class Product {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "product_id", nullable = false)
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    Date created_date;

    @Column(nullable = false)
    int owner;

    @Column(nullable = false)
    Date time_current;
}
