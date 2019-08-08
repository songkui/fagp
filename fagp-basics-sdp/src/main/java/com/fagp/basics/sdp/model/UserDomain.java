package com.fagp.basics.sdp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class UserDomain {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;


}