package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		return conn;
	}
	
	public static void closeConnection(Connection conn) throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
}
