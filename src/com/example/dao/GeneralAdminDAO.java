package com.example.dao;
 
import java.util.List;  
   
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
   
public interface GeneralAdminDAO {
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
	 * 普通管理员查看所有用户
	 * @return 返回User对象List集合
	 */
    List<User> findAllUser();
    /**
     * 普通管理员更改密码
     * @param admin 从service传递过来的admin参数
	 * @param rePassword 从service传递过来的新密码的参数
     */
    void updatePassword(Admin admin,String rePassword);
}
