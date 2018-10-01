<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div align="center">

		<form action="empDetails" method="get">
			<table>
				<tr>
					<td>Manager</td>
					<td><select size="1" name="manager">
							<option value="1">Rajesh</option>
							<option value="2">Ramesh</option>
							<option value="5">Mahesh</option>
					</select></td>
				</tr>
				<tr>
					<td>Month</td>
					<td><select size="1" name="month">
							<option value="1">Jan</option>
							<option value="2">Feb</option>
							<option value="3">March</option>
							<option value="4">Apr</option>
							<option value="5">May</option>
							<option value="6">Jun</option>
							<option value="7">Jul</option>
							<option value="8">Aug</option>
							<option value="9">Sept</option>
							<option value="10">Oct</option>
							<option value="11">Nov</option>
							<option value="12">Dec</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><button style="width: 70px; height: 20px;">Search</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>