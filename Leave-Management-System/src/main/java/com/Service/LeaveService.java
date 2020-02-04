package com.Service;

import java.util.List;

import com.POJO.Leave;

//import com.POJO.Department;

public interface LeaveService {

    public List<Leave> findAll();
	
	public Leave findById(int theId);
//	
	public void save(Leave theLeave);
//	
	public void deleteById(int theId);
	
}
