package com.bridgelabz.loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginpage.repo.DbConnector;
import com.mysql.cj.Session;

@WebServlet("/login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Connection connection = null;
	PreparedStatement st = null;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		
		String password = req.getParameter("password");
		boolean login = false;
		PrintWriter out = res.getWriter();
		String query = "select * from customer";
		connection = DbConnector.getConnection();
		try {
			st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equals(email)) {
					if (rs.getString(3).equals(password)) {
						login = true;
						HttpSession session = req.getSession();
//						session.setAttribute("resultSet", rs);
						session.setAttribute("email", email);
						session.setAttribute("password", password);
						req.setAttribute("resultSet", rs);
						RequestDispatcher rd=req.getRequestDispatcher("/Homepage.jsp");
						rd.forward(req, res);
					}
				}
			}
			if (!login) {
				out.println("username or password entered is wrong");
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
				rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
