package com.Service;

import java.util.List;

import com.POJO.Department;

public interface DepartmentService {

    public List<Department> findAll();
	
	public Department findById(int theId);
//	
	public void save(Department theDepartment);
//	
	public void deleteById(int theId);
	
	//public void saveOrUpdate(Department theDepartment);
}
