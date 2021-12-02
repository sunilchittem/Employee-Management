package com.cg.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emp.dao.EmployeeRepo;
import com.cg.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> showEmployees() {

		return employeeRepo.showEmployees();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeRepo.addEmployee(emp);

	}

	@Override
	public void deleteEmployee(int employeeId) {

		employeeRepo.deleteEmployee(employeeId);
	}

	@Override
	public Employee findEmployee(int employeeId) {

		return employeeRepo.findEmployee(employeeId);
	}

	@Override
	public void updateStudent(Employee emp) {

		employeeRepo.updateStudent(emp);
	}

}
