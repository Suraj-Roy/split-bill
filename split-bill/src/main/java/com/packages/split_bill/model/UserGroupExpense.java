package com.packages.split_bill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class UserGroupExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @ManyToOne
    @JoinColumn(referencedColumnName="id")
    private UserGroup userGroup;

    @ManyToOne
    @JoinColumn(referencedColumnName="id")
    private UserExpense userExpense;
}
