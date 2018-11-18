package com.example.web;
import java.util.List;
import com.example.pojo.entity.TestUser;
import com.example.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 
 * @author 崔朝阳
 */
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
	/**
	 * 
	 * @param  User user  用来存储登陆输入框中的账号密码
	 * @return 返回true登陆成功   否则 登陆失败
	 */
	public String login() {
		if(testService.login(user)==true) {
			 return "Login";       //如果为true,登陆成功
		}
		else {
			return "login_error";  //如果不是true，登陆失败
		}
	}
	/**
	 * 
	 * @param   User user 用来存储注册界面的账号密码等等 
	 * @return  返回true注册成功否则注册失败
	 */
	public String register() {
		if(testService.registered(user)==true) { 
			return  "registered"; 
		}
		else {
			return "register_error";
		}
		
	}
	
}
