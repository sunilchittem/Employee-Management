package com.cg.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.emp.entity.Employee;
import com.cg.emp.rowmapper.EmployeeRowMapper;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> showEmployees() {
		String sql = "select * from employees";
		List<Employee> empList = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return empList;
	}

	@Override
	public void addEmployee(Employee emp) {

		String sql = "insert into employees(emp_name,emp_dept,emp_desg,emp_sal) values(?,?,?,?)";

		Object[] args = { emp.getEmployeeName(), emp.getEmployeeDepartment(), emp.getEmployeeDesignation(),
				emp.getEmployeeSalary()};

		jdbcTemplate.update(sql, args);
	}
	@Override
	public void deleteEmployee(int employeeId) {
		String sql = "delete from employees where emp_id=?";
		jdbcTemplate.update(sql,employeeId);
	}

	@Override
	public void updateStudent(Employee emp) {

		String sql ="update employees set emp_name=?,emp_dept=?,emp_desg=?,emp_sal=? where emp_id=?";
		Object[] args=	{emp.getEmployeeName(),emp.getEmployeeDepartment(),emp.getEmployeeDesignation(),
				emp.getEmployeeSalary(),emp.getEmployeeId()};
		jdbcTemplate.update(sql, args);
	}

	@Override
	public Employee findEmployee(int employeeId) {
		String sql = "select * from employees where emp_id=?";
		Employee employee = jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(), employeeId);
		return employee;
	}

}
