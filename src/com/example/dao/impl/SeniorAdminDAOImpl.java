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
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#login(com.example.pojo.entity.Admin)
	 * 高级管理员登录
	 */
	@Override
	public boolean login(Admin admin) {
		 String hql="from Admin where adminName=? and adminPassword=?";
		 Admin a=(Admin) this.hibernateTemplate.find(hql,admin.getAdminName(),admin.getAdminPassword());
		 if(a==null||a.equals("")) 
		    return false;
		 else
		    return true;
	}
     
	@Override
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hibernateTemplate.find(hql);
		   return allUser;
	}

	@Override
	public void updatePassword(int id,String rePassword) {
		Admin admin=this.hibernateTemplate.get(Admin.class, id);
		admin.setAdminPassword(rePassword);
		this.hibernateTemplate.update(admin);
	}

	@Override
	public void addGeneralAdmin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGeneralAdmin(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findGeneralAdmin(int id) {
		// TODO Auto-generated method stub

	}

}
