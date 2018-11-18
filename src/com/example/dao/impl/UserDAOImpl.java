package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.UserDAO;
import com.example.pojo.entity.User;

public class UserDAOImpl implements UserDAO {
    
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<User> findAllUser(int start, int length) {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * (non-Javadoc)
	 * @see com.example.dao.UserDAO#login(com.example.pojo.entity.User)
	 * 用户登录
	 */
	@Override
	public boolean login(User user) {
	    String hql="from User where userName='"+user.getUserName()+"' and userPassword='"+user.getUserPassword()+"'";
	    User u=(User) this.hibernateTemplate.find(hql);
	    if(u==null||u.equals("")) 
	    	return false;
	    else
	    return true;
	}
    
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.UserDAO#register(com.example.pojo.entity.User)
	 * 用户注册
	 */
	@Override
	public void register(User user) {
		 this.hibernateTemplate.save(user);
	}

	@Override
	public void findFirstPrivacy(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findSecondPrivacy(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePrivacy(int id) {
		// TODO Auto-generated method stub

	}

}
