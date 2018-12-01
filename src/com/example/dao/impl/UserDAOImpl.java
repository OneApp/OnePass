
package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.UserDAO;
import com.example.pojo.entity.User;
import com.example.pojo.entity.UserOther;

public class UserDAOImpl implements UserDAO {
    
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	/**
	* 用户通过账号进行登录
	* @author 陈文权 
	* @param user 从service传递过来的含name的user参数
	* @return 返回user对象或null
	*/
	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(User user) {
		String hql="from User where userName=?";
		List<User> list= (List<User>) this.hibernateTemplate.find(hql, user.getUserName());
		if(list.size()>0)
			return list.get(0);
		else
		return null;
	}
	/**
	 * 用户通过邮箱进行登录
	 * @param user 从service传递过来的含email的user参数
	 * @return 返回user对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User findByEmail(User user) {
		String hql="from User where userEmail=?";
		List<User> list= (List<User>) this.hibernateTemplate.find(hql, user.getUserEmail());
		if(list.size()>0)
			return list.get(0);
		else
		return null;
	}
	/**
	 * 用户通过手机号进行登录
	 * @param user 从service传递过来的含phone的user参数
	 * @return 返回user对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User findByPhone(User user) {
		String hql="from User where userPhone=? ";
		List<User> list= (List<User>) this.hibernateTemplate.find(hql, user.getUserPhone());
		if(list.size()>0)
			return list.get(0);
		else
		return null;
	}
	/**
	 * 用户注册
	 * @param user 从service传递过来的user参数
	 */
	@Override
	public void addUser(User user) {
		 this.hibernateTemplate.save(user);
	}
	/**
	 * 用户查看一级隐私内容
	 * 根据传过来user对象中属性值来查询，假设user里面含有userId值
	 * @param user 从service传递过来的user参数
	 * @return 返回用户的一级隐私信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User findFirstPrivacy(User user) {
		String hql="select userName,userHead,userBirthday,userBirthdayIsCalendar,userSign,userHobbies,userMajor,userHeight,userWeight from User where userId=?";
		List<User> list=(List<User>) this.hibernateTemplate.find(hql, user.getUserId());
		if(list.size()>0) {
			return list.get(0);
		}else
		return null;
	}
	/**
	 * 用户查看二级隐私内容
	 * 根据传过来userOther对象中属性值来查询
	 * @param userOther 从service传递过来的userOther参数
	 * @return 返回用户的二级隐私信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public UserOther findSecondPrivacy(User user) {
		String hql="from User u right join UserOther o where u.userId=?";
		List<UserOther> list=(List<UserOther>) this.hibernateTemplate.find(hql, user.getUserId());
		if(list.size()>0) {
			return list.get(0);
		}else
		return null;
	}
	/**
	 * 用户查看三级隐私内容
	 * @param userOther 从service传递过来的userOther参数
	 * @return 返回用户的三级隐私信息
	 */
		@SuppressWarnings("unchecked")
		public User findThirdPrivacy(User user) {
		String hql="select u from User u join fetch UserOther o where u.userId=?";
		List<User> list=(List<User>) this.hibernateTemplate.find(hql, user.getUserId());
		if(list.size()>0) {
			return list.get(0);
		}else
		return null;
	 }
	
	/**
	 * 用户更改一级隐私内容
	 * @param user 从service传递过来的user参数
	 */
	@Override
	public void updateFirstPrivacy(User user) {

	}
	/**
	 * 用户更改二级隐私内容
	 * @param userOther 从service传递过来的userOther参数
	 */
	@Override
	public void updateSecondPrivacy(UserOther userOther) {
		
	}
	/**
	 * 用户更改三级隐私内容
	 * @param userOther 从service传递过来的userOther参数
	 */
	@Override
	public void updateThirdPrivacy(User user) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 用户更改密码
	 * @param user 从service传递过来的user参数
	 * @param rePassword 从service传递过来的新密码的参数
	 */
	@Override
	public void updatePassword(User user, String rePassword) {
		User u=this.hibernateTemplate.get(User.class, user.getUserId());
		u.setUserPassword(rePassword);
		this.hibernateTemplate.update(u);
	}
	/**
	 * 根据id返回user对象 查询二三级密码
	 * @param user 从service传递最初登录时的user对象
	 * @return 返回user对象
	 */
	@Override
	public User findUserById(User user) {
		User u=this.hibernateTemplate.get(User.class, user.getUserId());
		return u;
	}

}