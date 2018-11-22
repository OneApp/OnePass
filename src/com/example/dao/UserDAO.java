package com.example.dao;

import com.example.pojo.entity.User;
 
public interface UserDAO {
	User findByUsername(User user);
	User findByEmail(User user);
	User findByPhone(User user);
	void register(User user);
	User findFirstPrivacy(User user);
	User findSecondPrivacy(User user);
	void updatePrivacy(User user);
	void updatePassword(User user,String rePassword);
}
