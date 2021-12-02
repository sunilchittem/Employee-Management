<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
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
  <div style="text-align: center;">
  	<h1>Enter Details of Employee</h1>
  	<form:hidden path="employeeId"/>
	<form:form action="save-employee" modelAttribute="employee">
	<label>Employee Name :</label>
	<form:input path="employeeName" />
	<br>
	<label>Employee Department :</label>
	<form:input path="employeeDepartment" />
	<br>
	<label>Employee Designation :</label>
	<form:input path="employeeDesignation" />
	<br>
	<label>Employee Salary :</label>
	<form:input path="employeeSalary" />
	<br>
	<button type="submit">Add Student</button>
	</form:form>
  </div>
</body>
</html>