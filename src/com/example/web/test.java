package com.example.web;

import com.example.pojo.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class test extends ActionSupport {
    private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
  
}