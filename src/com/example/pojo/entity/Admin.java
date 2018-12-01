package com.example.pojo.entity;
 

public class Admin {
    private Integer adminId;
    private String adminName;
	private String adminPassword;
	private boolean adminJurisdiction;
	private String adminPhone;
	private String adminEmail;
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public boolean isAdminJurisdiction() {
		return adminJurisdiction;
	}
	public void setAdminJurisdiction(boolean adminJurisdiction) {
		this.adminJurisdiction = adminJurisdiction;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
}
