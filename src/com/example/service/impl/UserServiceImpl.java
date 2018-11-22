package com.example.service.impl;


import com.example.dao.UserDAO;
import com.example.pojo.entity.User;
import com.example.service.UserService;

/**
 * 
 * @author 严子江,胡龙
 *
 */

public class UserServiceImpl implements UserService {
    
	private UserDAO userDao;
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	/**
	 * @author 胡龙
	 * @param user 用户信息
	 */
	//用户注册
	@Override
	public void saveUser(User user) {
		//调用userDao根据注册的登录名获得用户对象
		User exitU = userDao.getByUserName(user.getUsername());
		if(exitU != null) {
			throw new RuntimeException("用户名已经存在!");
		}
		userDao.save(u);
		
	}
	/**
	 * @author 严子江
	 * @param user Action封装页面用户输入的信息
	 * @return	根据用户登录的不同方式调用dao不同的方法返回user对象
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		if(user.getUserEmail()!=null) {
			return userDao.findByEmail(user);
		}
		if(user.getUserPhone()!=null) {
			return userDao.findByPhone(user);
		}
		if(user.getUserName()!=null) {
			return userDao.findByUsername(user);
		}
		return null; 
	}
	
}
