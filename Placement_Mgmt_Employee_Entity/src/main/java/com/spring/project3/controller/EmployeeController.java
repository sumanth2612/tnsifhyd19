package com.spring.project3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project3.entity.Employee;
import com.spring.project3.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		//TODO: process POST request
		
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployees() {
		return employeeService.fetchAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Long id) {
		return employeeService.fetchEmployeeById(id);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id) {
		 employeeService.deleteEmployeeById(id);
		 return "Employee deleted Successfully!!";
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee (@PathVariable ("id") Long id, @RequestBody Employee employee) {
		//TODO: process PUT request
		
		return employeeService.updateEmployee(id,employee);
	}
}
