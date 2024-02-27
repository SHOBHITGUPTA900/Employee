package com.Employee.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Employee.entity.Employee;
import com.Employee.Employee.repository.EmployeeRepo;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
EmployeeRepo repo;
	@Override
	public void addEmployee(Employee e) {
		repo.save(e);
	
		
	}

	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);
		
	}

	@Override
	public Employee fetchEmployee(int id) {
	
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}

}
