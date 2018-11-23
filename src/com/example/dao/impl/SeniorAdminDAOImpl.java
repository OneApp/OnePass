package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.SeniorAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public class SeniorAdminDAOImpl implements SeniorAdminDAO {
	private HibernateTemplate hTemplate;

	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	
	/**
	 * 高级管理员通过账号进行登录
	 */
	@Override
	public Admin findByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hTemplate.find(hql,  admin.getAdminName(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}

	/**
	 * 高级管理员通过邮箱账号进行登录
	 */
	@Override
	public Admin findByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hTemplate.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}

	/**
	 * 高级管理员通过手机号进行登录
	 */
	@Override
	public Admin findByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hTemplate.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}
	
	/**
	 * 查看所有用户
	 */
	@Override
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hTemplate.find(hql);
		   return allUser;
	}
	
    /**
     * 更新密码
     */
	@Override
	public void updatePassword(Admin admin,String rePassword) {
		Admin a=this.hTemplate.get(Admin.class, admin.getAdminId());
		a.setAdminPassword(rePassword);
		this.hTemplate.update(a);
	}

	/**
	 * 添加普通管理员
	 */
	@Override
	public Admin addGeneralAdmin(Admin admin) {
	    this.hTemplate.save(admin);
		return admin;
	}  
    
	/**
	 * 删除普通管理员
	 */
	@Override
	public void deleteGeneralAdmin(Admin admin) {
		Admin a=this.hTemplate.get(Admin.class, admin.getAdminId());
        this.hTemplate.delete(a);
	}
    
	/**
	 * 查看所有普通管理员
	 */
	@Override
	public List<Admin> findAllGeneralAdmin() {
		   String hql="from Admin where adminJurisdiction=？";
		   List<Admin> generalAdmin=(List<Admin>) this.hTemplate.find(hql, false);
		   return generalAdmin;
	}

	/**
	 * 查看单个管理员
	 */
	@Override
	public Admin findGeneralAdmin(Admin admin) {
		   String hql="from Admin where adminId=?";
		   Admin a=(Admin)this.hTemplate.find(hql, admin.getAdminId());
		   return a;
	}

}
