package com.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.POJO.LeaveTracking;


@Repository
//@Transactional
public interface LeaveTrackingRepository extends JpaRepository<LeaveTracking, Integer> {
	/**
	   * This method will find list of LeaveTracking instance in the database.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	//https://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	//@Query("SELECT l.user_name,l.user_type,l.leave_type,l.from_date,l.to_date,l.remarks FROM  LeaveTracking l" )
	public List<LeaveTracking> findAll();

	//public LeaveTracking findById(int theId);
	/*@Modifying
	@Query("update LeaveTracking lt set lt.status = ?2 where lt.id = ?1")
	public void setUserInfoById(int theId, String status);
	*/
	
}
