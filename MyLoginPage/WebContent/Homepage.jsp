
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="logout" method="post">
		<div style='text-align: center'>
		<%
			ResultSet rs;
			rs = (ResultSet) request.getAttribute("resultSet");
			session= request.getSession();
			response.setHeader("Cache-Control", "no-cache, no-store, must-validate");//HTTP 1.1
			response.setHeader("Pragma", "no-cache");//HTTP 1.0
			response.setHeader("Expires", "0");//for proxy server
			if(session.getAttribute("email")==null)
				{
					RequestDispatcher rd=request.getRequestDispatcher("/Login.jsp");
					rd.forward(request, response);
				}
			
			out.println("logged in successfully!");
		%>
		<table class="table" border="1" align="center">
			<thead>
				<tr>
					<th width="200" hight="100" scope="col">#</th>
					<th width="200" hight="100" scope="col">Name</th>
					<th width="200" hight="100" scope="col">email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>
						<%
							out.println(rs.getString(1));
						%>
					</td>
					<td>
						<%
							out.println(rs.getString(2));
						%>
					</td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="logout">
		</div>
	</form>
</body>
</html>