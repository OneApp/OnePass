package com.example.dao;

import java.util.List;

import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
 
public interface UserDAO {
	List<User> findAllUser(int start ,int length);
	User findUser(User user);
	User loginByUsername(User user);
	User loginByEmail(User user);
	User loginByPhone(User user);
	void register(User user);
	User findFirstPrivacy(User user);
	User findSecondPrivacy(User user);
	void updatePrivacy(User user);
	void updatePassword(User user,String rePassword);
}
