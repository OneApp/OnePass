package com.example.web;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsSpringTestCase;
import org.apache.struts2.dispatcher.mapper.ActionMapping;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionProxy;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
public class Juint  extends StrutsSpringTestCase  {

	public void testGetActionMapping() {
        ActionMapping mapping = getActionMapping("user_login");
        assertNotNull(mapping);
        assertEquals("/", mapping.getNamespace());
        assertEquals("user_login", mapping.getName());//主界面登陆进来要传的现在还不知道
    }
	 public void testGetActionProxy() throws Exception {
	        //set parameters before calling getActionProxy
		    HttpServletRequest request = ServletActionContext.getRequest();
	       request.setAttribute("name", "FD");  
	        ActionProxy proxy = getActionProxy("user_login");
	        assertNotNull(proxy);

	        TestAction action = (TestAction) proxy.getAction();
	        assertNotNull(action);

	        String result = proxy.execute();
	        assertEquals(Action.SUCCESS, result);
	        assertEquals("FD", action.getUser());
	    }

	    public void testExecuteAction() throws ServletException, UnsupportedEncodingException {
	        String output = executeAction("/user_login.action");
	        assertEquals("Hello", output);
	    }

	    public void testGetValueFromStack() throws ServletException, UnsupportedEncodingException {
	        request.setParameter("name", "FD");
	        executeAction("/user_login.action");
	        String name = (String) findValueAfterExecute("name");
	        assertEquals("FD", name);
	    }
/**
 * 
 */
}
