package com.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase4kitchenstory", "root",
					"2020");
			return con;
		}

		catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
