package com.Service;

import java.util.List;

import com.POJO.LeaveTracking;

public interface LeaveTrackingService {

    public List<LeaveTracking> findAll();
	
	public LeaveTracking findById(int theId);
	
	public void save(LeaveTracking theLeaveTracking);
	
	public void deleteById(int theId);

}
