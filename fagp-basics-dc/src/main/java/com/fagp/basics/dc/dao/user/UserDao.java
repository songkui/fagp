package com.fagp.basics.dc.dao.user;



import com.fagp.basics.dc.model.user.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}