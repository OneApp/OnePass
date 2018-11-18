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
	public void setUserDao(UserDao userDao) {
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
	 * @param user action传过来的用户信息的javabean
	 * @param existUser 根据用户名到数据库中查询返回的对象
	 * @return 返回登录过程中出现的错误或成功信息
	 */
	@Override
	public String login(User user) {
		//根据用户名到数据库中查询返回的对象
		User existUser=userDao.getByUserName(user.getUsername());
		if(existUser!=null) {
			if(existUser.getPassword().equals(user.getPassword())) {
				return "匹配成功!";
			}else {
				return "密码错误无法登录!";
			}
		}else {
			return "该用户不存在!";
		}
	}
	
	
	
	
	
	

}
