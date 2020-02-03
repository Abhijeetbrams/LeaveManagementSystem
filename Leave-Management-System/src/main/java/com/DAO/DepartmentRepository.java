package com.DAO;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.Department;
//import com.POJO.LeaveTracking;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	

	
}
