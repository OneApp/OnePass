package com.example.service;

import com.example.pojo.entity.User;

/**
 * 
 * @author 严子江,胡龙
 *
 */
public interface UserService {
		
	//用户登录
	/**
	 * @author 严子江
	 * @param user	action传递过来的用户信息
	 * @return	返回登录过程中出现的错误或成功信息
	 */
	public User login(User user);
	
	/**
	 * 
	 * @param user action传递过来的用户信息
	 * @param vCode 验证码
	 */
	//用户注册
	public void registerByEmail(User user, String vCode);
	
	/**
	 * 
	 * @param user action传递过来的用户信息
	 * @return 验证码
	 */
	//用户点击注册前发送验证码邮件
	public void sendVCode(User user);
}
