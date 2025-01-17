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
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class UserProfile {

     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @OneToOne
    @JoinColumn(nullable=true, referencedColumnName = "id")
    private UserAccount userAccount;

    @CreatedBy
    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private UserAccount createdBy;

    @Column(nullable = false, unique = true)
    private String email;

    private String firstName;

    private String lastName;

    @Column(nullable=false)
    private Boolean isGuestUser = true;

    @CreatedDate
    @Column(nullable =false, updatable = false)
    private LocalDateTime createdDate;


}
