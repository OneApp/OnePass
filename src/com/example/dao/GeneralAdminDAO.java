package com.example.dao;

import java.util.List;  
  
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public interface GeneralAdminDAO {
    boolean login(Admin admin);
    List<User> findAllUser();
    void updatePassword(int id,String rePassword);
}
