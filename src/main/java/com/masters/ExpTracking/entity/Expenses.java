package com.masters.ExpTracking.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name="EXPENSE_TRACKING")
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID id;

    @Column(name="Description")
    private String Description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCrteDateTime() {
        return crteDateTime;
    }

    public void setCrteDateTime(Date crteDateTime) {
        this.crteDateTime = crteDateTime;
    }

    public Date getMdfdDateTime() {
        return mdfdDateTime;
    }

    public void setMdfdDateTime(Date mdfdDateTime) {
        this.mdfdDateTime = mdfdDateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Column(name="transactionDate")
    private LocalDate transactionDate;

    @Column(name="postDate")
    private LocalDate postDate;

    @Column(name="category")
    private String category;

    @Column(name="crteDateTime")
    private Date crteDateTime;

    @Column(name="mdfdDateTime")
    private Date mdfdDateTime;

    @Column(name="type")
    private String type;

    @Column(name="amount")
    private double  amount;


}
