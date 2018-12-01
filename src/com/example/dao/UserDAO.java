package com.example.dao;


import com.example.pojo.entity.User;
import com.example.pojo.entity.UserOther;
  
public interface UserDAO {
	/**
	 * 用户通过账号进行登录
	 * @author 陈文权 
	 * @param user 从service传递过来的含name的user参数
	 * @return 返回user对象或null
	 */
	User findByUsername(User user);
	/**
	 * 用户通过邮箱进行登录
	 * @param user 从service传递过来的含email的user参数
	 * @return 返回user对象或null
	 */
	User findByEmail(User user);
	/**
	 * 用户通过手机号进行登录
	 * @param user 从service传递过来的含phone的user参数
	 * @return 返回user对象或null
	 */
	User findByPhone(User user);
	/**
	 * 
	 */
	User findUserById(User user );
	/**
	 * 用户注册
	 * @param user 从service传递过来的user参数
	 */
	void addUser(User user);
	/**
	 * 用户查看一级隐私内容
	 * @param user 从service传递过来的user参数
	 * @return 返回用户的一级隐私信息
	 */
	User findFirstPrivacy(User user);
	/**
	 * 用户查看二级隐私内容
	 * @param user 从service传递过来的user参数
	 * @return 返回用户的二级隐私信息
	 */
	UserOther findSecondPrivacy(User user);
	/**
	 * 用户查看三级隐私内容
	 * @param user 从service传递过来的user参数
	 * @return 返回用户的三级隐私信息
	 */
	User findThirdPrivacy(User user);
	/**
	 * 用户更改一级隐私内容
	 * @param user 从service传递过来的user参数
	 */
	void updateFirstPrivacy(User user);
	/**
	 * 用户更改二级隐私内容
	 * @param user 从service传递过来的user参数
	 */
	void updateSecondPrivacy(UserOther userOther);
	/**
	 * 用户更改三级隐私内容
	 * @param user 从service传递过来的user参数
	 */
	void updateThirdPrivacy(User user);
	/**
	 * 用户更改密码
	 * @param user 从service传递过来的user参数
	 * @param rePassword 从service传递过来的新密码的参数
	 */
	void updatePassword(User user,String rePassword);
	
}
