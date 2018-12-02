package com.example.service;

import com.example.pojo.entity.User;
import com.example.pojo.entity.UserOther;

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
	public void registerByEmail(User user);
	
	/**
	 * 
	 * @param user action传递过来的用户信息
	 * @return 验证码
	 */
	//用户点击注册前发送验证码邮件
	public String sendVCode(User user);
	
	/**
	 * @author 胡龙
	 * @param user 用户信息
 	 * @return User 返回用户所有的一级隐私信息
	 */
	public User findFirstPrivacy(User user);

	/**
	 * @author 严子江
	 * @return 返回该用户所有的二级隐私信息
	 */
	public UserOther getUserSecondPrivacy(User user);
	/**
	 * @author 严子江
	 * @return 返回该用户所有的三级隐私信息
	 */
	public User getUserThirdPrivacy(User user); 
	/**
	 *	根据id可以返回完整的User对象
	 * @author 严子江
	 * @return 返回该用户的所有信息
	 */
	public User getUserById(User user);
}
