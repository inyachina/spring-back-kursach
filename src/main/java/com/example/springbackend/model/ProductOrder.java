package com.example.springbackend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@Table
public class ProductOrder {
    @Id
    @GeneratedValue(generator = "increment")
    int id;

    String status;

    Date createdDate;

    Date modifiedDate;

    int createdBy;

    int modifiedBy;

    int productId;

    int fromUser;

    int toUser;

    double fromTime;

    double toTime;

    public ProductOrder() {
    }

    public ProductOrder(Date createdDate, Date modifiedDate, int createdBy, int modifiedBy, int productId, int fromUser, int toUser, double fromTime, double toTime) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.productId = productId;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }
}
