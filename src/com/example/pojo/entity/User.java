package com.example.pojo.entity;

import java.util.Date;

public class User {
	private Integer userId;
    private String userPhone;
    private String userEmail;
    private Date userCreateDate;
    private String userPassword;
    private String userPasswordTwo;
    private String userPasswordThree;
    private String userName;
    private String userHead;
    private Date userBirthday;
	private boolean userBirthdayIsCalendar;
    private String userSign;
    private String userHobbies;
    private String userMajor;
    private Integer userHeight;
    private Integer userWeight;
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPasswordTwo() {
		return userPasswordTwo;
	}
	public void setUserPasswordTwo(String userPasswordTwo) {
		this.userPasswordTwo = userPasswordTwo;
	}
	public String getUserPasswordThree() {
		return userPasswordThree;
	}
	public void setUserPasswordThree(String userPasswordThree) {
		this.userPasswordThree = userPasswordThree;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHead() {
		return userHead;
	}
	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
    public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public boolean isUserBirthdayIsCalendar() {
		return userBirthdayIsCalendar;
	}
	public void setUserBirthdayIsCalendar(boolean userBirthdayIsCalendar) {
		this.userBirthdayIsCalendar = userBirthdayIsCalendar;
	}
	public String getUserSign() {
		return userSign;
	}
	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}
	public String getUserHobbies() {
		return userHobbies;
	}
	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies;
	}
	public String getUserMajor() {
		return userMajor;
	}
	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}
	public Integer getUserHeight() {
		return userHeight;
	}
	public void setUserHeight(Integer userHeight) {
		this.userHeight = userHeight;
	}
	public Integer getUserWeight() {
		return userWeight;
	}
	public void setUserWeight(Integer userWeight) {
		this.userWeight = userWeight;
	}

}
