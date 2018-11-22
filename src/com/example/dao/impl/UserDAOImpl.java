package com.example.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.UserDAO;
import com.example.pojo.entity.User;

public class UserDAOImpl implements UserDAO {
    
	private HibernateTemplate hTemplate;

	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
    
	 /**
     * 用户通过账号进行登录
     */
	@Override
	public User findByUsername(User user) {
		String hql="from User where userName=?";
		User u=(User) this.hTemplate.find(hql, user.getUserName());
		return u;
	}
	
	/**
	 * 用户通过邮箱账号进行登录
	 */
	@Override
	public User findByEmail(User user) {
		String hql="from User where userEmail=?";
		User u=(User) this.hTemplate.find(hql, user.getUserEmail());
		return u;
	}
	
    /**
     * 用户通过手机号进行登录
     */
	@Override
	public User findByPhone(User user) {
		String hql="from User where userPhone=? ";
		User u=(User) this.hTemplate.find(hql, user.getUserPhone());
		return u;
	}
	
	/**
	 * 用户注册
	 */
	@Override
	public void register(User user) {
		 this.hTemplate.save(user);
	}
	
	@Override
	public User findFirstPrivacy(User user) {
		
		return user;
	}

	@Override
	public User findSecondPrivacy(User user) {
		
		return user;
	}

	@Override
	public void updatePrivacy(User user) {

	}
	
    /**
     *用户更新密码
     */   
	@Override
	public void updatePassword(User user, String rePassword) {
		User u=this.hTemplate.get(User.class, user.getUserId());
		u.setUserPassword(rePassword);
		this.hTemplate.update(u);
	}
	
	
}
