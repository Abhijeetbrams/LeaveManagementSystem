package com.DAO;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.POJO.EmployeeLeaveDetail;

//import com.POJO.Employee;

@Repository
public interface EmployeeLeaveDetailRepository extends JpaRepository<EmployeeLeaveDetail, Integer> {


	@Query("from EmployeeLeaveDetail  where username =?1")
	Optional<EmployeeLeaveDetail> findByUsername(String username);

	@Query("from EmployeeLeaveDetail where username =?1")
	void deleteByUsername(String theUsername);

	
	

	
}
