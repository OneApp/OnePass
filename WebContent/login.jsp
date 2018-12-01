<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 
作者：ha
时间：2018.11.18
描述：  登录界面
 -->
<html>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="stylesheet" href="css/login.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">

  <title>登录</title>
</head>
<body>
<div class="onepass-login">
	<div class="onepass-login-logo-block">
		<!-- logo -->
		<div class="onepass-login-logo">
			<i>ONEPASS</i>
		</div>
		
		<!-- 欢迎词 -->
		<div class="onepass-login-logo-text">
			<div class="onepass-login-logo-text">
				<span>LOGIN</span>
				<div class="info">welcome here.</div>
			</div>
		</div>

		<!-- 登录表单 -->
		 <div class="login-center">
			<form class="login-form" action="#">
				
					<div class="login-form-group">
						<input type="text" class=""  id="username" placeholder="账号/邮箱/是手机号" onsubmit="return checkForm();">
					</div>

					<div class="login-form-group">
						<input type="password" class="" id="password" placeholder="密码" onsubmit="return checkForm();">
					</div>
				
					<button type="submit" id="login-button" class="login-btn">Log In</button>
				
			</form>
		</div>
		<div class="onepass-login-a"><a href="#">forget password</a> <span></span> <a data-toggle="modal" data-target="#myModal">register</a></div>	
	</div>
	<!-- 背景方块气泡 -->
		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>

</div>

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					Register
				</h4>
			</div>
			 <div class="modal-title">
                      <h1 class="text-center">Register</h1>
                 </div>
                 <div class="modal-body">
                    <form class="form-group" action="">
                             <div class="form-group">
                                 <label for="">用户名</label>
                                  <input class="form-control" type="text" placeholder="6-15位字母或数字">
                              </div>
                              <div class="form-group">
                                <label for="">密码</label>
                                  <input class="form-control" type="password" placeholder="至少6位字母或数字">
                              </div>
                              <div class="form-group">
                                  <label for="">再次输入密码</label>
                                  <input class="form-control" type="password" placeholder="至少6位字母或数字">
                              </div>
                              <div class="form-group">
                                  <label for="">请选择：</label><input type="radio"  onclick="changeTel()" name="change" checked="checked"  >手机号 <input type="radio" onclick="changeEmail()" name="change"  >邮箱
                                  <input class="form-control" id="emailortel" name="userphone">
                              </div>
                               <div class="form-group">
                                  <label for="">验证码</label>
                               <div >
                                	<table><tr><td> <input class="form-control" type="number"></td><td><input  class="btn btn-primary" onclick="settime(this)" value="获取验证码" style="width:100px;padding: 6px 0px;"/></td></tr></table>
                                </div>
                              </div>
                            <div class="text-right">
                                 <button class="btn btn-primary" type="submit">提交</button>
                                  <button class="btn btn-danger" data-dismiss="modal">取消</button>
                              </div>
                      </form>
                  </div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

<script type="text/javascript"> 
var countdown=60; 
function settime(obj) { 
    if (countdown == 0) { 
        obj.removeAttribute("disabled");    
        obj.value="获取验证码"; 
        countdown = 60; 
        return;
    } else { 
        obj.setAttribute("disabled", true);
        obj.value="重新发送(" + countdown + ")"; 
        countdown--; 
    } 
setTimeout(function() { 
    settime(obj) }
    ,1000) 
}

function changeTel(){
	document.getElementById("emailortel").setAttribute("name","userphone");
	document.getElementById("emailortel").setAttribute("placeholder","userphone");
}

function changeEmail(){
	document.getElementById("emailortel").setAttribute("name","email");
	document.getElementById("emailortel").setAttribute("placeholder","email");
}

</script>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>