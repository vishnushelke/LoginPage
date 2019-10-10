<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="register" method="post">
		<div style='text-align: center'>
			<fieldset style="width: 450px">
				<h3>registration page</h3>
				<div class="input-group mb-3" align="center">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1"></span>
					</div>
					<input type="text" class="form-control" placeholder="Name"
						name="name" aria-label="Name" aria-describedby="basic-addon1">
				</div>

				<div class="input-group mb-3" align="center">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1"></span>
					</div>
					<input type="text" class="form-control" placeholder="username"
						name="username" aria-label="Username"
						aria-describedby="basic-addon1">
				</div>

				<div class="input-group mb-3" align="center">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1"></span>
					</div>
					<input type="password" class="form-control" placeholder="Password"
						name="password" aria-label="Password"
						aria-describedby="basic-addon1">
				</div>

				<div class="input-group mb-3" align="center">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1"></span>
					</div>
					<input type="password" class="form-control"
						placeholder="Confirm Password" name="confirm_password"
						aria-label="Confirm Password" aria-describedby="basic-addon1">
				</div>
				<input type="submit" value="register" class="btn btn-dark"><a
					href="Login.jsp">Login</a>
			</fieldset>
		</div>
	</form>

</body>
</html>