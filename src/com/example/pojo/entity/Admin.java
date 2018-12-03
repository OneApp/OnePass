package com.example.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onepass_admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adminId")
    private Integer adminId;
	@Column(name="adminName")
    private String adminName;
	@Column(name="adminPassword")
	private String adminPassword;
	@Column(name="adminJurisdiction")
	private boolean adminJurisdiction;
	@Column(name="adminPhone")
	private String adminPhone;
	@Column(name="adminEmail")
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
