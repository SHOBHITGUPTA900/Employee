package com.Employee.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Employee.entity.Employee;
import com.Employee.Employee.service.EmployeeService;

@RestController
public class EmployeeController{
	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
		
	}
	@PutMapping("/update")
	public void updateEmployee( @RequestBody  Employee e) {
		service.updateEmployee(e);
	}
	@GetMapping("/fetch")
	public Employee fetchEmployee( @RequestParam int id) {
		return service.fetchEmployee(id);
		
	       
	}
	@GetMapping("/fetchAll")
	public List<Employee>fetchAllEmployee(){
	
	       
		return service.fetchAllEmployees();
		
	}
	

}
