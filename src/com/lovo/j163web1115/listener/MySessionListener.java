package com.lovo.j163web1115.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.lovo.j163web1115.util.OnlinePeopleComputer;


@WebListener
public class MySessionListener implements HttpSessionListener {

    
    public void sessionCreated(HttpSessionEvent se)  {
        System.out.println("----------session对象被创建了----------");
        OnlinePeopleComputer.add();
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("----------session对象被销毁了----------");
    	OnlinePeopleComputer.minus();
    }
	
}
