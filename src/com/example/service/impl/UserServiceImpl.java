package com.example.service.impl;


import java.util.UUID;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.example.dao.UserDAO;
import com.example.pojo.entity.User;
import com.example.service.UserService;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author 严子江,胡龙
 *
 */

public class UserServiceImpl implements UserService {
    
	private UserDAO userDao;
	private MailSender mailsend;
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void setMailsend(MailSender mailsend) {
		this.mailsend = mailsend;
	}

	/**
	 * @author 胡龙
	 * @return vCode 验证码
	 */
	//用户点击注册前发送邮件验证验证码
	@Override
	public void sendVCode(User user) {
		//调用userDao根据注册的登录名获得用户对象
		User exitU = userDao.findByUsername(user);
		if(exitU != null) {
			throw new RuntimeException("用户名已经存在!");
		}
		String vCode=UUID.randomUUID().toString().replaceAll("-", "").substring(0, 4);
		String msg="欢迎你,新的流浪者，你的暗号是：\n"+vCode+"\n（不区分大小写）";
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("hulong@163.com");
		smm.setSubject("注册验证");
		smm.setText(msg);
		smm.setTo(user.getUserName());
		mailsend.send(smm);
		ActionContext.getContext().put("vCode", vCode);		
	}
	/**
	 * @author 胡龙
	 * @param user 用户信息
	 */
	//用户注册
	@Override
	public void registerByEmail(User user,String vCode) {
	    if(vCode != null) {
	    	String vCode1 = (String) ActionContext.getContext().get("vCode");
	    	if(!vCode.equals(vCode1)) {
	    		userDao.addUser(user);
	    	}else {
	    		throw new RuntimeException("验证码错误!");
	    	}
	    }
		
		
	
		
	}
	/**
	 * @author 严子江
	 * @param user Action封装页面用户输入的信息
	 * @return	根据用户登录的不同方式调用dao不同的方法返回user对象
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		if(user.getUserEmail()!=null) {
			return userDao.findByEmail(user);
		}
		if(user.getUserPhone()!=null) {
			return userDao.findByPhone(user);
		}
		if(user.getUserName()!=null) {
			return userDao.findByUsername(user);
		}
		return null; 
	}
	
}
