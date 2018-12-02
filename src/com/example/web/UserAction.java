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
			ServletActionContext.getRequest().setAttribute("First",userService.findFirstPrivacy(user));     //一级隐私的内容
			 return "login";       //如果为true,登陆成功
		}else {
			ServletActionContext.getRequest().setAttribute("loginMsg","用户或密码错误");
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
			ServletActionContext.getRequest().setAttribute("user",user);//回显
			ServletActionContext.getRequest().setAttribute("registmsg","用户名重复，发送验证码失败");
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
					ServletActionContext.getRequest().setAttribute("resertmsg","验证码输入错误，注册失败");
					return "code_error";
				}	  
	}
	/**
	 * @param   注册二级密码
	 * @return second_rgted 注册二级密码成功
	 */
	public String second_rgt() {
		userService.setSecondPassword(user);//设置三级密码
		return "second_rgted";  
	}
	
	/**
	 * @param 点击二级隐私后展现
	 * @return  success 成功后二级隐私密码正确
	 * @return  error   失败后二级隐私密码错误
	 */
	public String Second() {
		if(user.getUserPasswordTwo()==userService.getUserById(user).getUserPasswordTwo()) {//输入框和数据库中二级密码匹配
			ActionContext.getContext().getSession().put("secstate","true");   //保持二级登陆二级状态
			ServletActionContext.getRequest().setAttribute("secondmsg",userService.getUserSecondPrivacy(user));;    //显示二级密码后的信息
			return "second";
		}else {
			ActionContext.getContext().getSession().put("secstate","false");   //二级错误状态
			ServletActionContext.getRequest().setAttribute("secondmsg","二级密码错误，无法展开二级隐私信息");
			return "second_error";
		}	
	}
	/**
	 * @param   注册三级级密码
	 * @return second_rgted 注册三级密码成功
	 */
	public String third_rgt() {
		  userService.setThirdPassword(user);//设置三级密码
		return "third_rgted";  
	}
	
	/**
	 * @param 点击三级隐私后展现
	 * @return  success 成功后三级隐私密码正确
	 * @return  error   失败后三级隐私密码错误 
	 */
	public String Third() {
		if(user.getUserPasswordThree()==userService.getUserById(user).getUserPasswordThree()) {//与数据库匹配
			ActionContext.getContext().getSession().put("thirstate","true");   //保持三级登陆状态
			ServletActionContext.getRequest().setAttribute("thirdmsg",userService.getUserSecondPrivacy(user));//显示三级密码后的信息
			userService.findFirstPrivacy(user);     
			return "third";
		}else {
			ActionContext.getContext().getSession().put("thirstate","false");   //三级密码错误
			ServletActionContext.getRequest().setAttribute("thirdmsg","三级密码错误，无法展开三级隐私信息");
			return "third_error";
		}
		
		
	}
}
