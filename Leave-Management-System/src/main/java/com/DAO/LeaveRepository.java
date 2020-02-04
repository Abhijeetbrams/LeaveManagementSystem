package com.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.Leave;

//import com.POJO.LeaveTracking;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer> {

	

	
}
