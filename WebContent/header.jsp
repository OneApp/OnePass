<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
</head>
<!--  
	作者：ha
	时间：2018.11.10
	描述：页面头部，含登录模态框
-->
<body>
<div id="header">
		<div id="nav"> 
			<div class="fr">
			
				<a href="#" id="loginButton"><span >Login</span></a>
				<a href="register.jsp" id="loginButton"><span >register</span></a>
				
				<!-- 登录框开始 -->
				<div id="loginBox">                
						<form id="loginForm">
						<fieldset id="body">
						<fieldset>
						<label for="username">username</label>
						<input type="text" name="username" id="username">
						</fieldset>
						<fieldset>
						<label for="password">Password</label>
						<input type="password" name="password" id="password">
						</fieldset>
						<input type="submit" id="login" value="Sign in">
						<label for="checkbox"><input type="checkbox" id="checkbox"><i>Remember me</i></label>
						</fieldset>
						<span><a href="#">Forgot your password?</a></span>
					</form>
				</div>
				<!-- 登录框结束 -->
			</div>
		</div>
			
	<div></div>
</div>
</body>
</html>