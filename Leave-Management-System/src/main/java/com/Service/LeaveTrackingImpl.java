package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.DAO.LeaveTrackingRepository;
import com.POJO.LeaveTracking;

@Service
public class LeaveTrackingImpl implements LeaveTrackingService {

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private LeaveTrackingRepository leaveTrackingRepo;
	
	
	
	
	
    @Override
	public List<LeaveTracking> findAll() {
    	System.out.println( leaveTrackingRepo.findAll()+"kjdsjkjhdjkj");
		return  leaveTrackingRepo.findAll();
	}

	@Override
	
	public LeaveTracking findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(LeaveTracking theLeaveTracking) {
		leaveTrackingRepo.save(theLeaveTracking);
	}

	@Override
	
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
