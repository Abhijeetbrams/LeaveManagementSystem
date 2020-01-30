package com.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.LeaveTracking;


@Repository
public interface LeaveTrackingRepository extends JpaRepository<LeaveTracking, Integer> {

	// that's it ... no need to write any code LOL!
	
}
