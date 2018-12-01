package com.example.dao.impl;
 
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.GeneralAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;
 

public class GeneralAdminDAOImpl implements GeneralAdminDAO {



	private HibernateTemplate hibernateTemplat;
	public void setHibernateTemplat(HibernateTemplate hibernateTemplat) {
		this.hibernateTemplat = hibernateTemplat;

	}
	
	/**
	 * 普通管理员通过账号进行登录
	 * @author 陈文权
	 * @param admin 从service传递过来的含name的admin参数
	 * @return 返回admin对象或null
    */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplat.find(hql, admin.getAdminName(),admin.getAdminPassword(),true);
		if(list.size()>0)    
			return list.get(0);
		else
		return null;
	}

	    
	/**
	 * (non-Javadoc)
	 * @see com.example.dao.GeneralAdminDAO#login(com.example.pojo.entity.Admin)
	 * 普通管理员通过邮箱账号进行登录
	 * @param admin 从service传递过来的含email的admin参数
	 * @return 返回admin对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplat.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		if(list.size()>0)
			return list.get(0);
		else
		return null;
	}
	/**
	 * 普通管理员通过手机号进行登录
	 * @param admin 从service传递过来的含phone的admin参数
	 * @return 返回admin对象或null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Admin findByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		List<Admin> list=(List<Admin>) this.hibernateTemplat.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		if(list.size()>0)
			return list.get(0);
		else
		return null;
	}
	/**
	 * 普通管理员查看所有用户
	 * @return 返回User对象List集合
	 */
	@SuppressWarnings("unchecked")
	@Override 
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hibernateTemplat.find(hql);
		   return allUser;
	}
    /**
     * 普通管理员更改密码
     * @param admin 从service传递过来的admin参数
	 * @param rePassword 从service传递过来的新密码的参数
     */
	@Override
	public void updatePassword(Admin admin,String rePassword) {
           Admin a=this.hibernateTemplat.get(Admin.class, admin.getAdminId());
           a.setAdminPassword(rePassword);
           this.hibernateTemplat.update(a);
	}


}
