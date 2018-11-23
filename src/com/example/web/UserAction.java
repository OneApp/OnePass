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
	private  String vCode;
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
			 return "Login";       //如果为true,登陆成功
		}else {
			return "login_error";  //如果不是true，登陆失败
		}
	}
	/**
	 * 
	 * @param   User user 用来存储注册界面的账号密码等等 
	 * @return  发送验证码并且传递一个user值保存用户信息返回用户当前注册信息界面
	 */   
	public String send() {  
		userService.sendVCode(user);
		ServletActionContext.getRequest().setAttribute("user",user);
			return  "sended";       
	}
	/**
	 * @param  user是User类所具有的信息，vCode是界面中的验证码输入框中的值
	 * @return registered  注册成功跳转
	 */
	public String register() {
			try {
				userService.registerByEmail(user, vCode);
				return  "registered"; 
			} catch (Exception e) {	
				e.printStackTrace();
				ActionContext.getContext().put("codeerror",e.getMessage());
				return "code_error";
			}  
	}
}
