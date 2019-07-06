package com.lovo.j163web1115.listener;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class MyRequestListener
 *
 */
@WebListener
public class MyRequestListener implements ServletRequestListener {
	
	private Date startDate;
	
	private Date endDate;
	
	private static long diff;

    
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("-----------Reuqest对象被销毁了------------");
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
//    	HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
    	System.out.println("-----------Reuqest对象被创建了------------");
    }
    
    public static long getResponseTime() {
    	
    	return diff;
    }
	
}
