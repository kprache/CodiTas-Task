package com.coditas.empService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coditas.model.Employee;
import com.coditas.utilities.DBConnectionUtility;

public class EmpDetailsService {

	public List getEmployeeList(int managerID, String month) {
		Connection connection = DBConnectionUtility.getDBConnection();
		List<Employee> list = new ArrayList<Employee>();
		try {
			Statement statement = connection.createStatement();
			String query = "select * from emp";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("emp_id"));
				employee.setE_name(rs.getString("emp_nm"));
				employee.setIn_time(rs.getString("in_time"));
				employee.setJoining_date(rs.getString("joining_date"));
				employee.setOut_time(rs.getString("out_time"));
				list.add(employee);
			}

		} catch (SQLException e) {
			System.out
					.println(" SQLException in getEmployeeList() EmpDetailsService");
			e.printStackTrace();
		} catch (Exception e) {
			System.out
					.println("Exception in getEmployeeList() EmpDetailsService");
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
		return list;
	}

	public void insertExcelEmpData() {
		EmpExcelDateReaderService dateReaderService = new EmpExcelDateReaderService();
		Connection connection = DBConnectionUtility.getDBConnection();
		try {
			String file = "C:\\Users\\Prachee\\git\\CODITAS-Assignment\\CoditasEmpManagementSystem\\src\\coditasEmpDetails.xlsx";
			 List<Employee> empList =dateReaderService.readFromExcel(file);
			 for (Employee employee : empList) {
				 String query = " insert into users (e_name, joining_date, in_time, out_time, mngr_id)"
					        + " values (?, ?, ?, ?, ?)";
					      PreparedStatement preparedStmt = connection.prepareStatement(query);
					      preparedStmt.setString (2, employee.getE_name());
					      preparedStmt.setString (3, employee.getJoining_date());
					      preparedStmt.setString(4, employee.getIn_time());
					      preparedStmt.setString(5, employee.getOut_time());
					      preparedStmt.execute();
				
			}
		} catch (IOException e) {
			System.out.println("Issue while reading excel  in insertExcelEmpData");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException while inserting in employee list");
			e.printStackTrace();
		}
	}

}
