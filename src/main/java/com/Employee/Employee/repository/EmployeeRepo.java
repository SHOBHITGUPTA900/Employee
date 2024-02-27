package com.Employee.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Employee.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

}
