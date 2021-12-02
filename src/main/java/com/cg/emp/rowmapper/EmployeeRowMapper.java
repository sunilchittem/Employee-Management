package com.cg.emp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.emp.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getInt("emp_id"));
		emp.setEmployeeName(rs.getString("emp_name"));
		emp.setEmployeeDepartment(rs.getString("emp_dept"));
		emp.setEmployeeDesignation(rs.getString("emp_desg"));
		emp.setEmployeeSalary(rs.getDouble("emp_sal"));
		return emp;
	}

}
