package com.DAO;

	import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

	import com.POJO.Employee;
	

	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



		@Query("from Employee  where username =?1")
		Optional<Employee> findByUsername(String username);

		

		
	}


