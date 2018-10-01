<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	
	<div align="center">
	
		<form action="login" method="get">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="user_name" placeholder="name" required></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" placeholder="password" required></td>
				</tr>
				<tr>
					<td></td>
					<td><button style="width: 70px; height: 20px;">Login</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
