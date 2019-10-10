
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
			out.println("logged in successfully!");
		%>
		<table class="table" border="1" align="center">
			<thead>
				<tr>
					<th width="200" hight="100" scope="col">#</th>
					<th width="200" hight="100" scope="col">Name</th>
					<th width="200" hight="100" scope="col">Username</th>
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
		<a href="Login.jsp">Logout</a>
		</div>
	</form>
</body>
</html>