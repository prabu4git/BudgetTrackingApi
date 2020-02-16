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
