package com.ab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.Employee;

@RestController
public class EmployeeServiceController {
	@GetMapping("/employee")
	public Employee listEmployees() {
		Employee employee = new Employee("100", "Avishek", "1234567890");
		return employee;

	}

}
