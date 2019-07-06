package com.lovo.j163web1115.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextAttributeListener
 *
 */
@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	
    	String key = scae.getName();
    	
    	String value = (String)scae.getValue();
    	
         System.out.println("----------上下文作用域仓库添加了数据---------- " + key + ", " + value);
    }

	
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	
    	String key = scae.getName();
    	
    	String value = (String)scae.getValue();
    	
    	System.out.println("----------上下文作用域仓库删除了数据----------" + key + ", " + value);
    }

    
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	
    	String key = scae.getName();
    	
    	String value = (String)scae.getValue();
    	
    	System.out.println("----------上下文作用域仓库覆盖（修改）了数据----------" + key + ", " + value);
    }
	
}
