package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.LeaveRepository;

import com.POJO.Leave;

@Service
public class LeaveServiceImpl implements LeaveService{

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private LeaveRepository LeaveRepo;
	
	
    @Override
	public List<Leave> findAll() {
    	System.out.println( LeaveRepo.findAll()+"kjdsjkjhdjkj");
		return  LeaveRepo.findAll();
	}
@Override
	
	public Leave findById(int theId) {
		Optional<Leave> result=LeaveRepo.findById(theId);
		
		Leave theLeave=null;
		if(result.isPresent())
		{
			theLeave=result.get();
		}
		else
		{
			throw new RuntimeException("Didn't find any leave by that Id-"+theId);
		}
		
		return theLeave;
		
	}

	@Override
	public void save(Leave theLeave) {
		LeaveRepo.save(theLeave);
	}

	@Override
	
	public void deleteById(int theId) {
		LeaveRepo.deleteById(theId);
	}
	
    /*public void saveOrUpdate(Department theDepartment)
    {
    	DepartmentRepo.saveOrUpdate(theDepartment);
    }*/
}
