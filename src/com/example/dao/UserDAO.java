package com.example.dao;

import java.util.List;

import com.example.pojo.entity.User;

public interface UserDAO {
	List<User> findAllUser(int start ,int length);
	void login(User user);
	void register(User user);
	void findFirstPrivacy(int id);
	void findSecondPrivacy(int id);
	void updatePrivacy(int id);
}
