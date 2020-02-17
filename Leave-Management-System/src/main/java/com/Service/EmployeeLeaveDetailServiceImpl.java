package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeLeaveDetailRepository;
import com.POJO.EmployeeLeaveDetail;

@Service
public class EmployeeLeaveDetailServiceImpl implements EmployeeLeaveDetailService{

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private EmployeeLeaveDetailRepository EmployeeLeaveDetailRepo;
	
	
    @Override
	public List<EmployeeLeaveDetail> findAll() {
    	System.out.println( EmployeeLeaveDetailRepo.findAll()+"kjdsjkjhdjkj");
		return  EmployeeLeaveDetailRepo.findAll();
	}
    
   @Override
	public EmployeeLeaveDetail findByUsername(String username) {
		Optional<EmployeeLeaveDetail> result=EmployeeLeaveDetailRepo.findByUsername(username);
		
		EmployeeLeaveDetail theEmployeeLeaveDetail=null;
		if(result.isPresent())
		{
			theEmployeeLeaveDetail=result.get();
		}
		else
		{
			System.out.println(result);
			throw new RuntimeException("Didn't find any EmployeeLeaveDetail by that Id-"+username);
		}
		
		return theEmployeeLeaveDetail;
		
	}

	@Override
	public void save(EmployeeLeaveDetail theEmployeeLeaveDetail) {
		EmployeeLeaveDetailRepo.save(theEmployeeLeaveDetail);
	}

	@Override
	public void deleteByUsername(String theUsername) {
		EmployeeLeaveDetailRepo.deleteByUsername(theUsername);
	}
	
    /*public void saveOrUpdate(Department theDepartment)
    {
    	DepartmentRepo.saveOrUpdate(theDepartment);
    }*/
}
