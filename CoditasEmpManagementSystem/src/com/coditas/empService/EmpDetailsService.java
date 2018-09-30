package com.coditas.empService;

import java.sql.Connection;
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
			System.out.println(" SQLException in getEmployeeList() EmpDetailsService");
			e.printStackTrace();
		}
		return list;
	}

}
