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
			<h1 style="color: red">Coditas Employe</h1>
			<h2 style="color: red">
				<a href="/EmployeeManagement/registration?who=admin">Add</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="" onclick="setUpdateUrl();" id="update">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="" onclick="setDeleteUrl();" id="delete">Delete</a>
			</h2>
			<table border="1" cellpadding="10">
				<caption>
					<h2>
						<a href="/EmployeeManagement/admin/show">List of All Employee</a>
					</h2>
				</caption>
				<th><input type="checkbox" id="selectall" onClick="selectAll(this);" /></th>
				<th>ID</th>
				<th>Name</th>
				<th>Joining Date</a></th>
				<th>In Time</th>
				<th>Out Time</th>
				<c:forEach var="emp" items="${employeeList}">
					<tr>
						<td><input name="employee" type="checkbox" value="${emp.id}" /></td>
						<td><c:out value="${emp.id}" /></td>
						<td><c:out value="${emp.name}" /></td>
						<td><c:out value="${emp.gender}" /></td>
						<td><c:out value="${emp.email}" /></td>
						<td><c:out value="${emp.mobNo}" /></td>
						<td><c:out value="${emp.address}" /></td>
						<td><c:out value="${emp.dob}" /></td>
						<td><c:out value="${emp.joinDate}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		

</body>
</html>