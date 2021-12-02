<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
	<h1 style="text-align: center;color: red;">Employee List</h1>
	<br>
	<table class="table table-success table-striped">
		<thead>
			<tr>
			<td>Employee Id</td>
			<td>Employee Name</td>
			<td>Employee Department</td>
			<td>Employee Designation</td>
			<td>Employee Salary</td>
			</tr>
		</thead>
		<c:forEach var="emp" items="${employees}">
			<tr>
			<td>${emp.employeeId}</td>
			<td>${emp.employeeName}</td>
			<td>${emp.employeeDepartment}</td>
			<td>${emp.employeeDesignation}</td>
			<td>${emp.employeeSalary}</td>
			<td><a href="/Employee-Management-System/delete-employee?empId=${emp.employeeId}" 
			onclick="if(!(confirm('do you really want to delete the employee?'))) return false">Delete</a></td>
			<td><a href="/Employee-Management-System/update-employee">Update</a></td>
			</tr>
			
		</c:forEach>
	</table>

</body>
</html>