package com.Employee.Employee.service;

import java.util.List;

import com.Employee.Employee.entity.Employee;

public interface EmployeeService {
	public void addEmployee(Employee e);
	public void updateEmployee(Employee e);
	Employee fetchEmployee(int id);
	List<Employee>fetchAllEmployees();
	public void deleteEmployee(int id);
	
	

}
