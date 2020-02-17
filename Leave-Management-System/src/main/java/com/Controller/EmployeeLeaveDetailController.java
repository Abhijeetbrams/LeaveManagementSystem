package com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Service.EmployeeLeaveDetailService;

@Controller
@RequestMapping("/employeeLeaveDetail")
public class EmployeeLeaveDetailController {
	@Autowired
	private EmployeeLeaveDetailService employeeLeaveDetailService;
	
	@GetMapping("/viewDetails")
	public String findByUsername(Model theModel,HttpServletRequest request)
	{ 
		String username1=(String) theModel.getAttribute("username");
	    System.out.println(username1);
	    String username=(String) request.getSession().getAttribute("username");
		theModel.addAttribute("employeeLeaveDetail", employeeLeaveDetailService.findByUsername(username));
		return "EmployeeViewLeaveDetail";
	}
	
/*	@GetMapping("/edit")
	public String findById(@RequestParam("id") int theId,Model theModel)
	{
		EmployeeLeaveDetail theEmployee=employeeLeaveDetailService.findByUsername(theId);
		theModel.addAttribute("employee",theEmployee );
		return "AddEmployee";
	}
	
	
	
	@PostMapping("/save")
	public String save(@Valid @ModelAttribute("employee") Employee theEmployee,Model theModel
			,@RequestParam("id") int theId,BindingResult theBindingResult)
	{
		System.out.println(theId);
		if(theId!=0)
		{
			Employee theemployee=employeeService.findById(theId);
			theemployee.setUsername(theemployee.getUsername());
			theemployee.setDepartment(theemployee.getDepartment());
			theemployee.setFull_name(theemployee.getFull_name());
			theemployee.setEmail(theemployee.getEmail());
			theemployee.setDesignation(theemployee.getDesignation());
			theemployee.setReporting(theemployee.getReporting());
			theemployee.setPhone_number(theemployee.getPhone_number());
			
		}
		System.out.println(theId);
		if(theBindingResult.hasErrors())
		{
			return "AddEmployee";
		}
		else
		{
			employeeService.save(theEmployee);
			
	        return "redirect:/employee/viewEmployee";
		}
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int theId)
	{
		employeeService.deleteById(theId);
		return "redirect:/employee/viewEmployee";
	}
	
	@GetMapping("/add")
	public String addDepartment(Model theModel)
	{
		theModel.addAttribute("employee", new Employee());
		return "AddEmployee";
	}*/
}
