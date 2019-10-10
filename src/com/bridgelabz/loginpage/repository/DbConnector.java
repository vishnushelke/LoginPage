package com.bridgelabz.loginpage.repository;
import java.sql.*;
public class DbConnector {
	static Connection connction=null;
	
	String url="jdbc:mysql://localhost:3306/mypage";
	String username="root";
	String password="root";
	
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connction=DriverManager.getConnection(url, username, password);
			return connction;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
