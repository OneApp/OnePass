package com.example.service.impl;

import com.example.service.User;
import com.example.service.UserService;

/**
 * 
 * @author 严子江,胡龙
 *
 */

public class UserServiceImpl implements UserService {
    
	private UserDao userDao;
	
	/**
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

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
