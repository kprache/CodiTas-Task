package com.coditas.empController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coditas.empService.EmpDetailsService;


public class CoditasExcelHandleConteoller extends HttpServlet {

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmpDetailsService detailsService = new EmpDetailsService();
		detailsService.insertExcelEmpData();
		request.getRequestDispatcher("/Coditas.jsp").forward(request, response);
	}

}
