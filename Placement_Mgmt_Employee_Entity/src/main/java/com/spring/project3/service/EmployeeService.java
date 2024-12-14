package com.spring.project3.service;

import java.util.List;

import com.spring.project3.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchAllEmployees();

	Employee fetchEmployeeById(Long id);

	void deleteEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

}
