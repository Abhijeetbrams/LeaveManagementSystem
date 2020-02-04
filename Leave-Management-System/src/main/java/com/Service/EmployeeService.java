package com.Service;

import java.util.List;

import com.POJO.Employee;

//import com.POJO.Department;

public interface EmployeeService {

    public List<Employee> findAll();
	
	public Employee findByUsername(String username);
//	
	public void save(Employee theEmployee);
//	

	public void deleteByUsername(String username);
	
}
