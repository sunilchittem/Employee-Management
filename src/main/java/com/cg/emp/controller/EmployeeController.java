package com.cg.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.emp.entity.Employee;
import com.cg.emp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/showemployees")
	public String showEmployee(Model model) {
		List<Employee> showEmployees = employeeService.showEmployees();
		model.addAttribute("employees", showEmployees);
		return "emp-info";
	}

	@GetMapping("/add-emp")
	public String addEmployee(@ModelAttribute("employee") Employee emp) {
		return "add-emp";
	}

	@PostMapping("/save-employee")
	public String saveEmployee(Employee emp) {
		if (emp.getEmployeeId() == 0) {
			employeeService.addEmployee(emp);
		} else {
			employeeService.updateStudent(emp);
		}
		return "redirect:/showemployees";
	}

	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam("empId") int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "redirect:/showemployees";
	}

	@GetMapping("/update-employee")
	public String updateEmployee(@RequestParam("empId") int employeeId, @ModelAttribute("employee") Employee employee) {
		Employee emp = employeeService.findEmployee(employeeId);
		employee.setEmployeeId(emp.getEmployeeId());
		employee.setEmployeeName(emp.getEmployeeName());
		employee.setEmployeeDepartment(emp.getEmployeeDepartment());
		employee.setEmployeeDesignation(emp.getEmployeeDesignation());
		employee.setEmployeeSalary(emp.getEmployeeSalary());

		return "add-emp";
	}
}
