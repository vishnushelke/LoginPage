package com.bridgelabz.loginpage.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.loginpage.model.Customer;
import com.bridgelabz.loginpage.repo.DbConnector;

public class LoginPage {
	static Connection connection = null;
	static PreparedStatement stCheck=null;
	public static boolean isAvailableCustomer(Customer customer) throws SQLException
	{
		String queryCheck="select * from customer";
		connection=DbConnector.getConnection();
		stCheck=connection.prepareStatement(queryCheck);
		ResultSet rs=stCheck.executeQuery();
		while(rs.next())
		{
			if(rs.getString(2).equals(customer.getUsername()))
			{
				return true;
			}
		}
		return false;
	}

}
