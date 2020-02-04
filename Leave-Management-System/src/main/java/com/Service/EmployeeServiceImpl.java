package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeRepository;
import com.POJO.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private EmployeeRepository EmployeeRepo;
	
	
    @Override
	public List<Employee> findAll() {
    	System.out.println( EmployeeRepo.findAll()+"kjdsjkjhdjkj");
		return  EmployeeRepo.findAll();
	}
@Override
	
	public Employee findByUsername(String username) {
		Optional<Employee> result=EmployeeRepo.findByUsername(username);
		
		Employee theEmployee=null;
		if(result.isPresent())
		{
			theEmployee=result.get();
		}
		else
		{
			throw new RuntimeException("Didn't find any Employee by that Id-"+username);
		}
		
		return theEmployee;
		
	}

	@Override
	public void save(Employee theEmployee) {
		EmployeeRepo.save(theEmployee);
	}

	@Override
	
	public void deleteByUsername(String username) {
		EmployeeRepo.deleteByUsername(username);
	}
	
    /*public void saveOrUpdate(Department theDepartment)
    {
    	DepartmentRepo.saveOrUpdate(theDepartment);
    }*/
}
