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
    int id;

    String name;

    String description;

    Date createdDate;

    int owner;

    Date timeCurrent;

    public Product() {
    }
}
