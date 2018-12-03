package com.example.pojo.entity;


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
@Table(name="onepass_userother")
public class UserOther {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userOtherId")
    private Integer userOtherId;
	@Column(name="userCountry")
	private String userCountry;
	@Column(name="userNation")
	private String userNation;
	@Column(name="userSex")
	private String userSex;
	@Column(name="userSoldier")
	private Boolean userSoldier;
	@Column(name="userQQ")
	private String userQQ;
	@Column(name="userWeChat")
	private String userWeChat;
	@Column(name="userPolitical")
	private String userPolitical;
	@Column(name="userBloodType")
	private String userBloodType;
	@Column(name="userEducation")
	private String userEducation;
	@Column(name="userMarried")
	private Boolean userMarried;
	@Column(name="userIdPhoto")
	private String userIdPhoto;
	@Column(name="userProfession")
	private String userProfession;
	@Column(name="userSalary")
	private String userSalary;
	@Column(name="userRealName")
	private String userRealName;
	@Column(name="userIdNumber")
	private String userIdNumber;
	@Column(name="userNationPlace")
	private String userNationPlace;
	@Column(name="userLocation")
	private String userLocation;
	@OneToOne(fetch = FetchType.EAGER)//设置加载
	@Cascade(CascadeType.ALL)//设置级联操作
    @JoinColumn(name = "userId",unique = true)
	private User user;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getUserOtherId() {
		return userOtherId;
	}
	public void setUserOtherId(Integer userOtherId) {
		this.userOtherId = userOtherId;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserNation() {
		return userNation;
	}
	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public boolean isUserSoldier() {
		return userSoldier;
	}
	public void setUserSoldier(boolean userSoldier) {
		this.userSoldier = userSoldier;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserWeChat() {
		return userWeChat;
	}
	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}
	public String getUserPolitical() {
		return userPolitical;
	}
	public void setUserPolitical(String userPolitical) {
		this.userPolitical = userPolitical;
	}
	public String getUserBloodType() {
		return userBloodType;
	}
	public void setUserBloodType(String userBloodType) {
		this.userBloodType = userBloodType;
	}
	public String getUserEducation() {
		return userEducation;
	}
	public void setUserEducation(String userEducation) {
		this.userEducation = userEducation;
	}
	public boolean isUserMarried() {
		return userMarried;
	}
	public void setUserMarried(boolean userMarried) {
		this.userMarried = userMarried;
	}
	public String getUserIdPhoto() {
		return userIdPhoto;
	}
	public void setUserIdPhoto(String userIdPhoto) {
		this.userIdPhoto = userIdPhoto;
	}
	public String getUserProfession() {
		return userProfession;
	}
	public void setUserProfession(String userProfession) {
		this.userProfession = userProfession;
	}
	public String getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(String userSalary) {
		this.userSalary = userSalary;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserIdNumber() {
		return userIdNumber;
	}
	public void setUserIdNumber(String userIdNumber) {
		this.userIdNumber = userIdNumber;
	}
	public String getUserNationPlace() {
		return userNationPlace;
	}
	public void setUserNationPlace(String userNationPlace) {
		this.userNationPlace = userNationPlace;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
}
