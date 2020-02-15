package com.masters.ExpTracking.entity;

import lombok.Data;

import javax.persistence.*;
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

    @Column(name="expenseDesc")
    private String expenseDesc;

    @Column(name="category")
    private String category;

    @Column(name="crteDateTime")
    private Date crteDateTime;

    @Column(name="mdfdDateTime")
    private Date mdfdDateTime;


}
