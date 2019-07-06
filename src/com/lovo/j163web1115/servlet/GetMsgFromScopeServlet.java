package com.lovo.j163web1115.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetMsgFromScopeServlet
 */
@WebServlet("/GetMsgFromScopeServlet")
public class GetMsgFromScopeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String usernameInRequest = (String)request.getAttribute("username");
		String usernameInSession = (String)request.getSession().getAttribute("username");
		String usernameInServletContext = (String)this.getServletContext().getAttribute("username");
		
		out.print("<h3>Request作用域：" + usernameInRequest + "</h3>");
		out.print("<h3>Session作用域：" + usernameInSession + "</h3>");
		out.print("<h3>Application作用域：" + usernameInServletContext + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
