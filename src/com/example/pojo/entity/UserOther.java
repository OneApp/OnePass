package com.example.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserOther {
	@Id
	@Column
    private Integer userOtherId;
	@Column
    private Integer userId;
	@Column
	private String userCountry;
	@Column
	private String userNation;
	@Column
	private String userSex;
	@Column
	private boolean userSoldier;
	@Column
	private String userQQ;
	@Column
	private String userWeChat;
	@Column
	private String userPolitical;
	@Column
	private String userBloodType;
	@Column
	private String userEducation;
	@Column
	private boolean userMarried;
	@Column
	private String userIdPhoto;
	@Column
	private String userProfession;
	@Column
	private String userSalary;
    @Column
	private String userRealName;
	@Column
	private String userIdNumber;
	@Column
	private String userNationPlace;
	@Column
	private String userLocation;
	public Integer getUserOtherId() {
		return userOtherId;
	}
	public void setUserOtherId(Integer userOtherId) {
		this.userOtherId = userOtherId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
