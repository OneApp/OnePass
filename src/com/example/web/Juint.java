package com.example.web;
import org.apache.struts2.StrutsSpringTestCase;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.junit.Test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionProxy;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
public class Juint  extends StrutsSpringTestCase  {

//	public void testGetActionMapping() {
//        ActionMapping mapping = getActionMapping("/user_login");
//        assertNotNull(mapping);
//        System.out.println("-------------------------------------------"+mapping.getName());
//        assertEquals("/", mapping.getNamespace());
//        assertEquals("user_login", mapping.getName());
//    }
	@Test
	 public void testGetActionProxy() throws Exception {
	        //set parameters before calling getActionProxuy
			
		    request.setParameter("userId", "123");  
		    request.setParameter("userPassword", "123");
	        ActionProxy proxy =getActionProxy("/user_login");
	        System.out.println("66666666666666666666666666666666----------------------");
	        assertNotNull(proxy);
	        System.out.println("66666666666666666666666666666666----------------------");
	        UserAction action = (UserAction) proxy.getAction();
	        System.out.println("6666666666666666666666666666666666"+action);
	        assertNotNull(action);
	        String result = proxy.execute();
	        System.out.println("6666666666666666666666666666666666"+result);
	        assertEquals(Action.LOGIN,result);
	      /*  assertEquals("123",);*/
	    }

//	    public void testExecuteAction() throws ServletException, UnsupportedEncodingException {
//	        String output = executeAction("/user/user_login");
//	        assertEquals("login", output);
//	    }
//
//	    public void testGetValueFromStack() throws ServletException, UnsupportedEncodingException {
//	        request.setParameter("name", "FD");
//	        executeAction("/user_login.action");
//	        String name = (String) findValueAfterExecute("name");
//	        assertEquals("FD", name);
//	    }
		
/**
 * 
 */
}
