package com.example.service;

import com.example.pojo.entity.User;

/**
 * 
 * @author 严子江,胡龙
 *
 */
public interface UserService {
	/**
	 * @author 胡龙
	 * @param user	action传递过来的用户信息
	 * @return 无返回值
	 */
	//用户注册
	public void saveUser(User user);
	
	//用户登录
	/**
	 * @author 严子江
	 * @param user	action传递过来的用户信息
	 * @return	返回登录过程中出现的错误或成功信息
	 */
	public User login(User user);
}
