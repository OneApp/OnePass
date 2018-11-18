package com.example.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Admin {
	@Id
	@Column
    private Integer adminId;
	@Column
    private String adminName;
	@Column
	private String adminPasswprd;
	@Column
	private boolean adminJurisdiction;
	@Column
	private String adminPhone;
	@Column
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
	public String getAdminPasswprd() {
		return adminPasswprd;
	}
	public void setAdminPasswprd(String adminPasswprd) {
		this.adminPasswprd = adminPasswprd;
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
