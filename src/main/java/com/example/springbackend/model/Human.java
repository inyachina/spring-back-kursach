package com.example.springbackend.model;


import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@Table
public class Human {
    @Id
    @GeneratedValue(generator = "increment")
    private int id;

    private String name;

    private String surname;

    private Date birthdayDate;

    private float time;

    private int userId;

    @Nullable
    private String fate;

    public Human(String name, String surname, Date birthdayDate, int userId, float time, @Nullable String fate) {
        this.name = name;
        this.surname = surname;
        this.birthdayDate = birthdayDate;
        this.userId = userId;
        this.time = time;
        this.fate = fate;
    }

    public Human() {
    }
}
