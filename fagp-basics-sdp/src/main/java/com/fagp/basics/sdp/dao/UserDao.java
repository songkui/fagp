package com.fagp.basics.sdp.dao;


import com.fagp.basics.sdp.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}