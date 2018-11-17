package com.example.dao;

import java.util.List;   

import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public interface SeniorAdminDAO {
	void login(Admin admin);
	List<User> findAllUser();  
	void updatePassword(int id);
	void addGeneralAdmin();
	void deleteGeneralAdmin(int id);
	void findGeneralAdmin(int id);
}
