package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.POJO.LeaveTracking;
import com.Service.DepartmentService;
//import com.POJO.Department;
@Controller
@RequestMapping("/department")
public class Department {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/viewDepartment")
	public String findAll(Model theModel)
	{
	
		theModel.addAttribute("departments", departmentService.findAll());
		return "ViewDepartment";
	}
	
	@GetMapping("/edit")
	public String findById(@RequestParam("id") int theId,Model theModel)
	{
		com.POJO.Department thedepartment=departmentService.findById(theId);
		theModel.addAttribute("departments", thedepartment);
		return "AddDepartment";
	}
	
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("departments") com.POJO.Department theDepartment,Model theModel
			,@RequestParam("id") int theId)
	{
		System.out.println(theId);
		if(theId!=0)
		{
			com.POJO.Department thedepartment=departmentService.findById(theId);
					
			thedepartment.setDepartment(thedepartment.getDepartment());
		}
		System.out.println(theId);
		 departmentService.save(theDepartment);
         return "redirect:/department/viewDepartment";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int theId)
	{
		departmentService.deleteById(theId);
		return "redirect:/department/viewDepartment";
	}
	
	@GetMapping("/add")
	public String addDepartment(Model theModel)
	{
		theModel.addAttribute("departments", new com.POJO.Department());
		return "AddDepartment";
	}
}
