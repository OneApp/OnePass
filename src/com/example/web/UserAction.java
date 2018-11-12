package com.example.web;
import java.util.List;
import com.example.pojo.entity.TestUser;
import com.example.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class UserAction extends ActionSupport  implements ModelDriven<User> {
	private User user = new User(); 
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	private UserService userService;
	
	public void setTestService(UserService userService) {
		this.userService = userService;
	}
	public String login() {
		if(testService.login()==true) { //验证登陆如果账号密码匹配返回布尔类型
			 return "Login";//如果为true,登陆成功
		}
		else {
			return "login_error";  //如果不是true，登陆失败
		}
	}
	public String register() {
		if(testService.registered()==true) { //验证注册信息返回布尔类型
			return  "registered";    //注册成功后
		}
		else {
			return "register_error";    //注册失败后
		}
		
	}
	
}
