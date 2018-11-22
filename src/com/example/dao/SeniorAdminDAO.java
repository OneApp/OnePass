package com.example.dao;

import java.util.List;     

import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public interface SeniorAdminDAO {
    Admin findByAdminName(Admin admin);
	Admin findByEmail(Admin admin);
	Admin findByPhone(Admin admin);
	List<User> findAllUser();  
	void updatePassword(Admin admin,String rePassword);
	Admin addGeneralAdmin(Admin admin);
	void deleteGeneralAdmin(Admin admin);
	List<Admin> findAllGeneralAdmin();
	Admin findGeneralAdmin(Admin admin);
}
