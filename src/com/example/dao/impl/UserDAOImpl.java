package com.example.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.UserDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public class UserDAOImpl implements UserDAO {
    
	private HibernateTemplate hTemplate;

	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	@Override
	public List<User> findAllUser(int start, int length) {
		// TODO Auto-generated method stub
		return null;
	}
    
	 /*
     * (non-Javadoc)
     * @see com.example.dao.UserDAO#loginByUsername(com.example.pojo.entity.User)
     * 通过用户名进行登录
     */
	@Override
	public User loginByUsername(User user) {
		String hql="from User where userName=? and userPassword=?";
		User u=(User) this.hTemplate.find(hql, user.getUserName(),user.getUserPassword());
		return u;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.UserDAO#loginByEmail(com.example.pojo.entity.User)
	 * 通过邮箱账号进行登录
	 */
	@Override
	public User loginByEmail(User user) {
		String hql="from User where userEmail=? and userPassword=?";
		User u=(User) this.hTemplate.find(hql, user.getUserEmail(),user.getUserPassword());
		return u;
	}
	
    /*
     * (non-Javadoc)
     * @see com.example.dao.UserDAO#loginByPhone(com.example.pojo.entity.User)
     * 通过手机号进行登录
     */
	@Override
	public User loginByPhone(User user) {
		String hql="from User where userPhone=? and userPassword=?";
		User u=(User) this.hTemplate.find(hql, user.getUserPhone(),user.getUserPassword());
		return u;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.UserDAO#register(com.example.pojo.entity.User)
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
	
    /*
     * (non-Javadoc)
     * @see com.example.dao.UserDAO#updatePassword(com.example.pojo.entity.User, java.lang.String)
     *通过传过来的用户信息及最新密码来更改用户密码
     */   
	@Override
	public void updatePassword(User user, String rePassword) {
		User u=this.hTemplate.get(User.class, user.getUserId());
		u.setUserPassword(rePassword);
		this.hTemplate.update(u);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.UserDAO#findUser(com.example.pojo.entity.User)
	 * 查看单个用户
	 */
	@Override
	public User findUser(User user) {
		   String hql="from User where userId=？";
		   User u=(User)this.hTemplate.find(hql, user.getUserId());
		   return u;
	}
	
}
