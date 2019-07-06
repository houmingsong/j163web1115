package com.lovo.j163web1115.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class
 * MySessionAttributeListener
 *
 */
@WebListener
public class MySessionAttributeListener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent se) {

		String key = se.getName();

		String value = (String) se.getValue();

		System.out.println("----------session������ֿ����������---------- " + key + ", " + value);
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {

		String key = se.getName();

		String value = (String) se.getValue();

		System.out.println("----------session������ֿ�ɾ��������----------" + key + ", " + value);

	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		
		String key = se.getName();

		String value = (String) se.getValue();

		System.out.println("----------session������ֿ⸲�ǣ��޸ģ�������----------" + key + ", " + value);
	}

}
