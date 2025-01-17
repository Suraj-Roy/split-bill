package com.packages.split_bill.dto;

import lombok.Data;

@Data
public class UserProfileDto {

    private Long Id;
    
    private Long userProfileId;

    private String email;

    private String firstName;

    private String lastName;

    private Boolean isGuestUser;

}
