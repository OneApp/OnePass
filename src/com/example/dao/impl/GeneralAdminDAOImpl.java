package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.GeneralAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
 
public class GeneralAdminDAOImpl implements GeneralAdminDAO {
	private HibernateTemplate hTemplate;
	
	//<<<<<<< HEAD
	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	
    /**
     * @author 陈文权
     * 普通管理员通过账号进行登录
     */
	@Override
	public Admin findByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminName(),admin.getAdminPassword(),true);
		return a;
	}

	/**
<<<<<<< HEAD
	 * 通过普通管理员邮箱账号进行登录
=======
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}  
	    
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.GeneralAdminDAO#login(com.example.pojo.entity.Admin)
	 * ��ͨ����Ա��¼
>>>>>>> refs/remotes/origin/master
=======
	 * 普通管理员通过邮箱账号进行登录
>>>>>>> refs/remotes/origin/yanzijiang
	 */
	@Override
	public Admin findByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		return a;
	}

	/**
	 * 普通管理员通过手机号进行登录
	 */
	@Override
	public Admin findByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		return a;
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
}
