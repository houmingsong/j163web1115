package com.lovo.j163web1115.listener;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	//��ServletContext�����ٵ�ʱ����ô˷���
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
//		ServletContext context = sce.getServletContext();
//		
		System.out.println("----------ServletContext����������----------s");
		
//		try {
//			//�Ӳֿ�����ȡ����������ֵ
//			Integer totalCount = (Integer)sce.getServletContext().getAttribute("totalCount");
//			
//			//�ѷ���������д�뵽count.properties
//			Properties prop = new Properties();
//			prop.setProperty("total", totalCount.toString());
////			FileOutputStream fos = new FileOutputStream("D:\\eclipse_web_workspace\\j163web1115\\WebContent\\WEB-INF\\count.properties");
//			String path = sce.getServletContext().getRealPath("WEB-INF/count.properties");
//			FileOutputStream fos = new FileOutputStream(path);
//			prop.store(fos, null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

	//��ServletContext��������ʱ����ô˷���
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
//		ServletContext context = sce.getServletContext();
//		
		System.out.println("----------ServletContext���󱻴�����----------");
		
//		try {
//			
//			Properties prop = new Properties();
//			//��count.properties������
//			//ͨ����ģ��õ������������ͨ��������������ȡ��·���µ���Դ�ļ��������������Ƕ�ȡproperties�ļ���
//			prop.load(this.getClass().getClassLoader().getResourceAsStream("count.properties"));
//			FileInputStream fis = new FileInputStream("D:\\eclipse_web_workspace\\j163web1115\\WebContent\\WEB-INF\\count.properties");
//			String path = sce.getServletContext().getRealPath("WEB-INF/count.properties");
//			FileInputStream fis = new FileInputStream(path);
//			prop.load(fis);
//			
//			String totalStr = prop.getProperty("total");
//			Integer total = Integer.valueOf(totalStr);
//			
//			//�ѷ����������������Ĳֿ�����
//			ServletContext context = sce.getServletContext();
//			context.setAttribute("totalCount", total);
//			
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
}
