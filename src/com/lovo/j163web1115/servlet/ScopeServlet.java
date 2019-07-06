package com.lovo.j163web1115.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request�ֿ�
		request.setAttribute("username", "request�����������");
		//session�ֿ�
		request.getSession().setAttribute("username", "session�����������");
		//servletContext�ֿ�
		this.getServletContext().setAttribute("username", "application�����������");
		
		request.getRequestDispatcher("/GetMsgFromScopeServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
