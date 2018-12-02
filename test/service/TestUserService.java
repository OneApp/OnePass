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
 * @author 胡龙  严子江
 *
 */

//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration(locations= {"classpath:applicationContext.xml","classpath:spring/*Bean.xml"})
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
    /**
     * @author 严子江
     *	 测试用户登录的三种不同方法
     */
    @Test
    public void testLogin() {
    	User user=new User();
//    	user.setUserName("严子江");	//如果是用户名方式登录
//    	user.setUserPhone("15779933526"); //如果是手机号登录
    	user.setUserEmail("673343330@qq.com"); //如果是邮箱登录
    	System.out.println(userService.login(user).getUserEmail());
    }
}
