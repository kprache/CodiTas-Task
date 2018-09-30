package com.coditas.empService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coditas.utilities.DBConnectionUtility;

public class EmpDetailsService {

	List getEmployeeList(int managerID, String month) {
		Connection connection = DBConnectionUtility.getDBConnection();
		List list = new ArrayList();
		try {
			Statement statement = connection.createStatement();
			String query = "select * from emp";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				list.add(rs.getInt("emp_id"));
				list.add(rs.getString("emp_nm"));
				list.add(rs.getString("joining_date"));
				list.add(rs.getString("in_time"));
				list.add(rs.getString("out_time"));
			}

		} catch (SQLException e) {
			System.out.println(" SQLException in getEmployeeList() EmpDetailsService");
			e.printStackTrace();
		}
		return list;
	}

}
