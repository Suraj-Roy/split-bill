package com.packages.split_bill.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class UserExpense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private UserProfile userProfile;

    @Column(nullable = false)
    private String expenseDescription;

    @Column(nullable=false)
    private Long expenseAmount;
    
    @CreatedBy
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false, updatable = false)
    private UserAccount createdBy;
    
    @CreatedDate
    private LocalDateTime createdDateTime;

}
