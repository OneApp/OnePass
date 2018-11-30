package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.SeniorAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
  
public class SeniorAdminDAOImpl implements SeniorAdminDAO {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	/**
	 * 普通管理员通过账号进行登录
	 * @author 陈文权
	 * @param admin 从service传递过来的含name的admin参数
	 * @return 返回admin对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplate.find(hql,  admin.getAdminName(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}
	/**
	 * 普通管理员通过邮箱进行登录
	 * @param admin 从service传递过来的含email的admin参数
	 * @return 返回admin对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplate.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}
	/**
	 * 普通管理员通过手机号进行登录
	 * @param admin 从service传递过来的含phone的admin参数
	 * @return 返回admin对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplate.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}
	/**
	 * 高级管理员查看所有用户
	 * @return 返回所有用户信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hibernateTemplate.find(hql);
		   return allUser;
	}
	/**
	 * 高级管理员更改密码
	 * @param admin 从service传递过来的admin参数
	 * @param rePassword 从service传递过来的新密码的参数
	 */
	@Override
	public void updatePassword(Admin admin,String rePassword) {
		Admin a=this.hibernateTemplate.get(Admin.class, admin.getAdminId());
		a.setAdminPassword(rePassword);
		this.hibernateTemplate.update(a);
	}
	/**
	 * 高级管理员添加普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 */
	@Override
	public void addGeneralAdmin(Admin admin) {
	    this.hibernateTemplate.save(admin);
	}  
	/**
	 * 高级管理员删除普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 */
	@Override
	public void deleteGeneralAdmin(Admin admin) {
		Admin a=this.hibernateTemplate.get(Admin.class, admin.getAdminId());
        this.hibernateTemplate.delete(a);
	}
	/**
	 * 高级管理员查看单个普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 * @return 返回普通管理员信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAllGeneralAdmin() {
		   String hql="from Admin where adminJurisdiction=？";
		   List<Admin> generalAdmin=(List<Admin>) this.hibernateTemplate.find(hql, false);
		   return generalAdmin;
	}
	/**
	 * 高级管理员查看单个普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 * @return 返回普通管理员信息
	 */
	@Override
	public Admin findGeneralAdmin(Admin admin) {
		   String hql="from Admin where adminId=?";
		   Admin a=(Admin)this.hibernateTemplate.find(hql, admin.getAdminId());
		   return a;
	}

}
