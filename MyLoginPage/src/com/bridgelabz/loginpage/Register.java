package com.bridgelabz.loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginpage.model.Customer;
import com.bridgelabz.loginpage.repo.DbConnector;
import com.bridgelabz.loginpage.services.LoginPage;

@WebServlet("/register")
public class Register extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Connection connection = null;
	PreparedStatement st=null;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		Customer customer = new Customer();
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String confirmPassword=req.getParameter("confirm_password");
		
		customer.setName(name);
		customer.setPassword(password);
		customer.setEmail(email);
		
		String query="insert into customer values(?,?,?)";
		connection=DbConnector.getConnection();
		try {
			st=connection.prepareStatement(query);
			
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, password);
			PrintWriter out=res.getWriter();
			
			if(LoginPage.isAvailableCustomer(customer))
			{
				out.println("You are already registered,Kindly login");
				out.println();
				RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
				rd.forward(req, res);
			}
			else
			{
				st.executeUpdate();
			}
				
			if(password.equals(confirmPassword))
			{
				out.println("You are registered successfully\n Login to continue");
				RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
				rd.forward(req, res);
			}
				
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
