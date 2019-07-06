package com.lovo.j163web1115.listener;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	//当ServletContext被销毁的时候调用此方法
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
//		ServletContext context = sce.getServletContext();
//		
		System.out.println("----------ServletContext对象被销毁了----------s");
		
//		try {
//			//从仓库里面取出访问量的值
//			Integer totalCount = (Integer)sce.getServletContext().getAttribute("totalCount");
//			
//			//把访问量重新写入到count.properties
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

	//当ServletContext被创建的时候调用此方法
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
//		ServletContext context = sce.getServletContext();
//		
		System.out.println("----------ServletContext对象被创建了----------");
		
//		try {
//			
//			Properties prop = new Properties();
//			//把count.properties读进来
//			//通过类模版得到类加载器对象，通过类加载器对象读取类路径下的资源文件（比如在这里是读取properties文件）
//			prop.load(this.getClass().getClassLoader().getResourceAsStream("count.properties"));
//			FileInputStream fis = new FileInputStream("D:\\eclipse_web_workspace\\j163web1115\\WebContent\\WEB-INF\\count.properties");
//			String path = sce.getServletContext().getRealPath("WEB-INF/count.properties");
//			FileInputStream fis = new FileInputStream(path);
//			prop.load(fis);
//			
//			String totalStr = prop.getProperty("total");
//			Integer total = Integer.valueOf(totalStr);
//			
//			//把访问量保存在上下文仓库里面
//			ServletContext context = sce.getServletContext();
//			context.setAttribute("totalCount", total);
//			
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
}
