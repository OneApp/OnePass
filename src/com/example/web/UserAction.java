package com.example.web;
import org.apache.struts2.ServletActionContext;

import com.example.pojo.entity.User;
import com.example.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * @author 崔朝阳
 */

public class UserAction extends ActionSupport  implements ModelDriven<User> {
	private User user = new User(); 
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private  String vCode;   //验证码的存储
	public String getvCode() {
		return vCode;
	}
	public void setvCode(String vCode) {
		this.vCode = vCode;
	}
	/**
	 * 
	 * @param  User user  用来存储登陆界面中的User属性
	 * @return 返回“匹配成功！”  登陆成功   否则 登陆失败
	 */
	public String login() {
		User realUser=userService.login(user);
		if(realUser!=null) {
			ActionContext.getContext().getSession().put("user", realUser);
			 return "login";       //如果为true,登陆成功
		}else {
			return "login_error";  //如果不是true，登陆失败
		}
	}
	/**
	 * 
	 * @param   User user 用来存储注册界面的账号密码等等 
	 * @return  sended 无相同用户名，可以发送验证码
	 * @return  user_repeat 有相同的用户名，帐号重复，不能发送验证码
	 */   
	public String send() {  
		try {
			String code=userService.sendVCode(user);
			ActionContext.getContext().getSession().put("code", code);//得到用户的验证码
			ServletActionContext.getRequest().setAttribute("user",user);//回显
			return  "sended";
		} catch (Exception e) {
			e.printStackTrace();
			return "user_repeat";
		}       
	}
	/**
	 * @param  user是User类所具有的信息，vCode是界面中的验证码输入框中的值
	 * @return registered  注册成功跳转  
	 * @return code_error 验证码输入错误
	 */   
	public String register() {  
				String code=(String) ActionContext.getContext().getSession().get("code");
				if(vCode==code) {
					userService.registerByEmail(user);//注册用户
					return  "registered"; 
								}	
				else {  
					return "code_error";
				}
			  
	}
}
