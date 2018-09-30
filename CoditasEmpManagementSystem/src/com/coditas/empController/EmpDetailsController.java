package com.coditas.empController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.coditas.model.Employee;
import com.coditas.empService.EmpDetailsService;

public class EmpDetailsController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("manager_id");
		String month = request.getParameter("month");
		EmpDetailsService empDetailsService = new EmpDetailsService();

		List<Employee> empList = empDetailsService.getEmployeeList(Integer.parseInt(id), month);
		request.setAttribute("employeeList", empList);
		request.getRequestDispatcher("EmployeeDetails.jsp").forward(request,
				response);
	}

}
