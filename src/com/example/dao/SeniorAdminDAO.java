package com.example.dao;

import java.util.List;     

import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public interface SeniorAdminDAO {
    Admin loginByAdminName(Admin admin);
	Admin loginByEmail(Admin admin);
	Admin loginByPhone(Admin admin);
	List<User> findAllUser();  
	void updatePassword(Admin admin,String rePassword);
	Admin addGeneralAdmin(Admin admin);
	void deleteGeneralAdmin(Admin admin);
	List<Admin> findAllGeneralAdmin();
	Admin findGeneralAdmin(Admin admin);
}
