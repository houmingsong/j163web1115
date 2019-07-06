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
    	
         System.out.println("----------������������ֿ����������---------- " + key + ", " + value);
    }

	
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	
    	String key = scae.getName();
    	
    	String value = (String)scae.getValue();
    	
    	System.out.println("----------������������ֿ�ɾ��������----------" + key + ", " + value);
    }

    
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	
    	String key = scae.getName();
    	
    	String value = (String)scae.getValue();
    	
    	System.out.println("----------������������ֿ⸲�ǣ��޸ģ�������----------" + key + ", " + value);
    }
	
}
