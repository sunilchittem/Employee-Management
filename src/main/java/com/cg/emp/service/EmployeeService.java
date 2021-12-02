package com.cg.emp.service;

import java.util.List;

import com.cg.emp.entity.Employee;

public interface EmployeeService {

	public List<Employee> showEmployees();
	public void addEmployee(Employee emp);
	public void deleteEmployee(int employeeId);
	public Employee findEmployee(int employeeId);
	public void updateStudent(Employee emp);
}
