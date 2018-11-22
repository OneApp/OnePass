package com.example.web;

import java.util.List;

import com.example.pojo.entity.TestUser;
import com.example.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private TestService testService;
	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public String getUser() {
		// TODO Auto-generated method stub
		return null;

	}

}
