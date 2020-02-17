package com.Service;

import java.util.List;

import com.POJO.Employee;

public interface EmployeeService {

    public List<Employee> findAll();
	
	public Employee findById(int theId);
//	
	public void save(Employee theEmployee);
//	
	public void deleteById(int theId);

	public Employee findByUsername(String username);
	
	//public void saveOrUpdate(Department theDepartment);
}
