package com.example.dao;

import java.util.List;  
  
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
  
public interface GeneralAdminDAO {
    Admin loginByAdminName(Admin admin);
	Admin loginByEmail(Admin admin);
	Admin loginByPhone(Admin admin);
    List<User> findAllUser();
    void updatePassword(Admin admin,String rePassword);
}
