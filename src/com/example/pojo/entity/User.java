package com.example.pojo.entity;
 
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
@Table(name="onepass_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userId;
	@Column(name="userPhone")
    private String userPhone;
	@Column(name="userEmail")
    private String userEmail;
	@Column(name="userCreateDate",columnDefinition="datetime")
    private Date userCreateDate;
	@Column(name="userPassword")
    private String userPassword;
	@Column(name="userPasswordTwo")
    private String userPasswordTwo;
	@Column(name="userPasswordThree")
    private String userPasswordThree;
	@Column(name="userName")
    private String userName;
	@Column(name="userHead")
    private String userHead;
	@Column(name="userBirthday" ,columnDefinition="datetime")
    private Date userBirthday;
	@Column(name="userBirthdayIsCalendar")
	private Boolean userBirthdayIsCalendar;
	@Column(name="userSign")
    private String userSign;
	@Column(name="userHobbies")
    private String userHobbies;
	@Column(name="userMajor")
    private String userMajor;
	@Column(name="userHeight")
    private Integer userHeight;
	@Column(name="userWeight")
    private Integer userWeight;
	@OneToOne(mappedBy="user")
	@Cascade(CascadeType.ALL)
    private UserOther userOther;
  
	public UserOther getUserOther() {
		return userOther;
	}
	public void setUserOther(UserOther userOther) {
		this.userOther = userOther;
	}
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
	public User() {}
	public User(String userName, String userHead, Date userBirthday, Boolean userBirthdayIsCalendar, String userSign,
			String userHobbies, String userMajor, Integer userHeight, Integer userWeight) {
		super();
		this.userName = userName;
		this.userHead = userHead;
		this.userBirthday = userBirthday;
		this.userBirthdayIsCalendar = userBirthdayIsCalendar;
		this.userSign = userSign;
		this.userHobbies = userHobbies;
		this.userMajor = userMajor;
		this.userHeight = userHeight;
		this.userWeight = userWeight;
	}
	
}
