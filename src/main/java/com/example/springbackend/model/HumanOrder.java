package com.example.springbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table
public class HumanOrder {
    @Id
    @GeneratedValue(generator = "increment")
    int id;

    String status;

    Date createdDate;

    Date modifiedDate;

    int createdBy;

    int modifiedBy;

    @OneToOne
    Human human;
}
