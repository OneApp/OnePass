
# 发送邮件的教程


------------------------------------------------------------

你需要在你要使用mailSend的类中定义mailsend属性，并将其注入

```java
@RequestMapping(value="/registerByEmail",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String registerByEmail(String userId,HttpSession session) {
		System.out.println("registerByEmail------------------------------------"+session.getId());
		if(isUser(userId)) {
			return "该号码已被占用";
		}
		String vCode=UUID.randomUUID().toString().replaceAll("-", "").substring(0, 4);
		String msg="欢迎你,新的流浪者，你的暗号是：\n"+vCode+"\n（不区分大小写）";
		System.out.println("registerByEmail----------------------------------"+msg);
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("lee_dage@163.com");
		smm.setSubject("注册验证");
		smm.setText(msg);
		smm.setTo(userId);
		user me=new user();
		me.setUserId(userId);
		session.setAttribute("newUser", me);
		mailSender.send(smm);
		session.setAttribute("vCode", vCode);
		return "已发送，请输入你的验证码";
	}
```