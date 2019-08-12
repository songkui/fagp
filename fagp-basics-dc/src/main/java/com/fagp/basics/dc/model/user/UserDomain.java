package com.fagp.basics.dc.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;


}