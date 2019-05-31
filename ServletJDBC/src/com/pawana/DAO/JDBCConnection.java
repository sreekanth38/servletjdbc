package com.pawana.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBCConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		if(con == null)
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naveen","root", "root");
		return con;
		
	}

}
