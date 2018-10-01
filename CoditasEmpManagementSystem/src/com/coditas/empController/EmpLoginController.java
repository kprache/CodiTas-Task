package com.coditas.empController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpLoginController extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String emp_uname = request.getParameter("user_name");
		String emp_pass = request.getParameter("password");
		
		boolean dbpass = false;
		if (emp_uname != null | emp_uname != null) {
			
			request.getRequestDispatcher("/Coditas.jsp").forward(request, response);
			
		}  else {
			request.getRequestDispatcher("/error_pages/error.jsp").include(request, response);
			request.getRequestDispatcher("/adminLogin.jsp").include(request, response);
		}
	
		
	}



}
