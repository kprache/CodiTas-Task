package com.coditas.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {

	/**
	 * Code for getting connection obj
	 * 
	 * @return
	 */
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			String url2 = "jdbc:mysql://localhost:3306/coditasdb?user=root&password=root";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url2);
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println(" ClassNotFoundException ");
			e.printStackTrace();
		} catch (SQLException ex) {
			System.out.println(" SQLException ");
			ex.printStackTrace();
		}
		return con;
	}

}
