package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.GeneralAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public class GeneralAdminDAOImpl implements GeneralAdminDAO {
	private HibernateTemplate hTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	
    /*
     * (non-Javadoc)
     * @see com.example.dao.GeneralAdminDAO#loginByAdminName(com.example.pojo.entity.Admin)
     * 通过高级管理员的账号进行登录
     */
	@Override
	public Admin loginByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminName(),admin.getAdminPassword(),true);
		return a;
	}

	 /*
     * (non-Javadoc)
     * @see com.example.dao.GeneralAdminDAO#loginByEmail(com.example.pojo.entity.Admin)
     * 通过高级管理员的邮箱账号进行登录
     */
	@Override
	public Admin loginByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		return a;
	}

	 /*
     * (non-Javadoc)
     * @see com.example.dao.GeneralAdminDAO#loginByPhone(com.example.pojo.entity.Admin)
     * 通过高级管理员手机号进行登录
     */
	@Override
	public Admin loginByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		return a;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.GeneralAdminDAO#findAllUser()
	 * 查看所有用户
	 */
	@Override
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hTemplate.find(hql);
		   return allUser;
	}

	 /*
     * (non-Javadoc)
     * @see com.example.dao.GeneralAdminDAO#updatePassword(com.example.pojo.entity.Admin)
     * 更新密码
     */
	@Override
	public void updatePassword(Admin admin,String rePassword) {
           Admin a=this.hTemplate.get(Admin.class, admin.getAdminId());
           a.setAdminPassword(rePassword);
           this.hTemplate.update(a);
	}

	

}
