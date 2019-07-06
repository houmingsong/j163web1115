package com.lovo.j163web1115.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lovo.j163web1115.util.OnlinePeopleComputer;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/TestOnlinePeopleServlet")
public class TestOnlinePeopleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(10);
		
		PrintWriter out = response.getWriter();
		
		out.print("<h2>在线人数为：" + OnlinePeopleComputer.getOnlinePeople() + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
