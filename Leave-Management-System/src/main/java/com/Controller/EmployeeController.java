package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.POJO.Employee;

import com.Service.EmployeeService;
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/viewEmployee")
	public String findAll(Model theModel)
	{
	
		theModel.addAttribute("employee", employeeService.findAll());
		return "ViewEmployee";
	}
	
	@GetMapping("/edit")
	public String findByUsername(@RequestParam("username") String username,Model theModel)
	{
		Employee theemployee=employeeService.findByUsername(username);
		theModel.addAttribute("employee", theemployee);
		return "AddEmployee";
	}
	
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee theEmployee,Model theModel
			,@RequestParam("username") String username)
	{
		System.out.println(username);
		if(username!="" || username!=null)
		{
			Employee theemployee=employeeService.findByUsername(username);
					
			theemployee.setDepartment(theemployee.getDepartment());
			theemployee.setFull_name(theemployee.getFull_name());
			theemployee.setEmail(theemployee.getEmail());
			theemployee.setDesignation(theemployee.getDesignation());
			theemployee.setReporting(theemployee.getReporting());
			theemployee.setPhone_number(theemployee.getPhone_number());
			
			
		}
		
		//System.out.println(theId);
		employeeService.save(theEmployee);
         return "redirect:/employee/viewEmployee";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("username") String username)
	{
		employeeService.deleteByUsername(username);
		return "redirect:/employee/viewEmployee";
	}
	
	@GetMapping("/add")
	public String addDepartment(Model theModel)
	{
		theModel.addAttribute("employee", new Employee());
		return "AddEmployee";
	}
}
