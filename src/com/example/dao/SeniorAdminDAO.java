package com.example.dao;

import java.util.List;     

import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
   
public interface SeniorAdminDAO {
	/**
	 * 普通管理员通过账号进行登录
	 * @author 陈文权
	 * @param admin 从service传递过来的含name的admin参数
	 * @return 返回admin对象或null
	 */
    Admin findByAdminName(Admin admin);
	/**
	 * 普通管理员通过邮箱进行登录
	 * @param admin 从service传递过来的含email的admin参数
	 * @return 返回admin对象或null
	 */
	Admin findByEmail(Admin admin);
	/**
	 * 普通管理员通过手机号进行登录
	 * @param admin 从service传递过来的含phone的admin参数
	 * @return 返回admin对象或null
	 */
	Admin findByPhone(Admin admin);
	/**
	 * 高级管理员查看所有用户
	 * @return 返回所有用户信息
	 */
	List<User> findAllUser();  
	/**
	 * 高级管理员更改密码
	 * @param admin 从service传递过来的admin参数
	 * @param rePassword 从service传递过来的新密码的参数
	 */
	void updatePassword(Admin admin,String rePassword);
	/**
	 * 高级管理员添加普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 */
	void addGeneralAdmin(Admin admin);
	/**
	 * 高级管理员删除普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 */
	void deleteGeneralAdmin(Admin admin);
	/**
	 * 高级管理员查看所有普通管理员
	 * @return 返回所有普通管理员
	 */
	List<Admin> findAllGeneralAdmin();
	/**
	 * 高级管理员查看单个普通管理员
	 * @param admin 从service传递过来的普通管理员admin参数
	 * @return 返回普通管理员信息
	 */
	Admin findGeneralAdmin(Admin admin);
}
