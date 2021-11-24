package com.curd.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.apps.model.Employee;
import com.curd.apps.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/test")
	public String testAPI() {
		return "testAPI is working or not";
	}

	@GetMapping(value = "/employees")
	public List<Employee> findAllEmployess() {
		return employeeService.findAllEmployess();
	}

	@PostMapping(value = "/employees")
	public String saveEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);

	}
}
