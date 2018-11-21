package com.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.dao.SeniorAdminDAO;
import com.example.pojo.entity.Admin;
import com.example.pojo.entity.User;

public class SeniorAdminDAOImpl implements SeniorAdminDAO {
	private HibernateTemplate hTemplate;

	public void setHibernateTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#loginByAdminName(com.example.pojo.entity.Admin)
	 * 通过高级管理员的账号进行登录
	 */
	@Override
	public Admin loginByAdminName(Admin admin) {
		String hql="from Admin where adminName=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminName(),admin.getAdminPassword(),true);
		return a;
	}

	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#loginByEmail(com.example.pojo.entity.Admin)
	 * 通过高级管理员的邮箱账号进行登录
	 */
	@Override
	public Admin loginByEmail(Admin admin) {
		String hql="from Admin where adminEmail=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminEmail(),admin.getAdminPassword(),true);
		return a;
	}

	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#loginByPhone(com.example.pojo.entity.Admin)
	 * 通过高级管理员的手机号进行登录
	 */
	@Override
	public Admin loginByPhone(Admin admin) {
		String hql="from Admin where adminPhone=? and adminPassword=? and adminJurisdiction=?";
		Admin a=(Admin) this.hTemplate.find(hql, admin.getAdminPhone(),admin.getAdminPassword(),true);
		return a;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#findAllUser()
	 * 查看所有用户
	 */
	@Override
	public List<User> findAllUser() {
		   String hql="from User";
		   List<User> allUser=(List<User>) this.hTemplate.find(hql);
		   return allUser;
	}
	
    /*
     * (non-Javadoc)
     * @see com.example.dao.SeniorAdminDAO#updatePassword(com.example.pojo.entity.Admin, java.lang.String)
     * 更新密码
     */
	@Override
	public void updatePassword(Admin admin,String rePassword) {
		Admin a=this.hTemplate.get(Admin.class, admin.getAdminId());
		a.setAdminPassword(rePassword);
		this.hTemplate.update(a);
	}

	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#addGeneralAdmin(com.example.pojo.entity.Admin)
	 * 添加普通管理员
	 */
	@Override
	public Admin addGeneralAdmin(Admin admin) {
	    this.hTemplate.save(admin);
		return admin;
	}
    
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#deleteGeneralAdmin(com.example.pojo.entity.Admin)
	 * 删除普通管理员
	 */
	@Override
	public void deleteGeneralAdmin(Admin admin) {
		Admin a=this.hTemplate.get(Admin.class, admin.getAdminId());
        this.hTemplate.delete(a);
	}
    
	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#findAllGeneralAdmin(com.example.pojo.entity.Admin)
	 * 查看所有普通管理员
	 */
	@Override
	public List<Admin> findAllGeneralAdmin() {
		   String hql="from Admin where adminJurisdiction=？";
		   List<Admin> generalAdmin=(List<Admin>) this.hTemplate.find(hql, false);
		   return generalAdmin;
	}

	/*
	 * (non-Javadoc)
	 * @see com.example.dao.SeniorAdminDAO#findGeneralAdmin(com.example.pojo.entity.Admin)
	 * 查看单个管理员
	 */
	@Override
	public Admin findGeneralAdmin(Admin admin) {
		   String hql="from Admin where adminId=？";
		   Admin a=(Admin)this.hTemplate.find(hql, admin.getAdminId());
		   return a;
	}


	


}
