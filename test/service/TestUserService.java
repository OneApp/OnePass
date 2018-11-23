package service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.pojo.entity.User;
import com.example.service.UserService;

/**
 * service测试类
 * @author 胡龙
 *
 */

//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml,classpath:struts/UserAction.xml,classpath:serviceBean.xml")
public class TestUserService {
    @Resource(name="userService")
	private UserService userService;
    
    @Test
    public void testSendVCode() {
    	User user = new User();
    	user.setUserName("胡龙");
    	String vCode = userService.sendVCode(user);
    	System.out.println(vCode);
    }
    
    @Test
    public void testRegisterByEmail() {
    	User user = new User();
    	user.setUserName("胡龙");    	
    	userService.registerByEmail(user);
    }
}
