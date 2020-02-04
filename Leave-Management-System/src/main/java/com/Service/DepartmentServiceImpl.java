package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.DepartmentRepository;
//import com.DAO.LeaveTrackingRepository;
import com.POJO.Department;
//import com.POJO.LeaveTracking;
//import com.POJO.LeaveTracking;
//import com.POJO.LeaveTracking;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private DepartmentRepository DepartmentRepo;
	
	
    @Override
	public List<Department> findAll() {
    	System.out.println( DepartmentRepo.findAll()+"kjdsjkjhdjkj");
		return  DepartmentRepo.findAll();
	}
@Override
	
	public Department findById(int theId) {
		Optional<Department> result=DepartmentRepo.findById(theId);
		
		Department theDepartment=null;
		if(result.isPresent())
		{
			theDepartment=result.get();
		}
		else
		{
			throw new RuntimeException("Didn't find any leave by that Id-"+theId);
		}
		
		return theDepartment;
		
	}

	@Override
	public void save(Department theDepartment) {
		DepartmentRepo.save(theDepartment);
	}

	@Override
	
	public void deleteById(int theId) {
	   DepartmentRepo.deleteById(theId);
	}
	
    /*public void saveOrUpdate(Department theDepartment)
    {
    	DepartmentRepo.saveOrUpdate(theDepartment);
    }*/
}
