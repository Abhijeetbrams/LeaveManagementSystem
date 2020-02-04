package com.Service;

import java.util.List;

import com.POJO.EmployeeLeaveDetail;

//import com.POJO.Department;

public interface EmployeeLeaveDetailService {

    public List<EmployeeLeaveDetail> findAll();
	
	public EmployeeLeaveDetail findByUsername(String theUsername);
//	
	public void save(EmployeeLeaveDetail theEmployeeLeaveDetail);
//	
	public void deleteByUsername(String theUsername);
	
}
