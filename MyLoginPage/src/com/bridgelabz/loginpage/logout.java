package com.bridgelabz.loginpage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class logout extends HttpServlet{

	static Connection connection = null;
	PreparedStatement st = null;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
//		ResultSet rs=(ResultSet) req.getAttribute("resultSet");
		RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
		
		
		
	}
}
