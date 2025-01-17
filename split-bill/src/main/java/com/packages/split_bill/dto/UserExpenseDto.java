package com.packages.split_bill.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserExpenseDto {

    private Long Id;

    private String userProfileId;

    private String expenseDescription;

    private Long expenseAmount;

    private Long userAccountId;

    private LocalDateTime createdDateTime;



}
