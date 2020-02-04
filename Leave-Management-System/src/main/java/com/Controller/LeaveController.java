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

import com.POJO.Leave;
import com.Service.LeaveService;
@Controller
@RequestMapping("/leave")
public class LeaveController {

	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/viewLeave")
	public String findAll(Model theModel)
	{
	
		theModel.addAttribute("leaves", leaveService.findAll());
		return "ViewLeave";
	}
	
	@GetMapping("/edit")
	public String findById(@RequestParam("id") int theId,Model theModel)
	{
		Leave theLeave=leaveService.findById(theId);
		theModel.addAttribute("leaves", theLeave);
		return "AddLeave";
	}
	
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("leaves") Leave theLeave,Model theModel
			,@RequestParam("id") int theId)
	{
		System.out.println(theId);
		if(theId!=0)
		{
			Leave theleave=leaveService.findById(theId);
					
			theleave.setLeavetype(theleave.getLeavetype());
		}
		//System.out.println(theId);
		leaveService.save(theLeave);
         return "redirect:/leave/viewLeave";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int theId)
	{
		leaveService.deleteById(theId);
		return "redirect:/leave/viewLeave";
	}
	
	@GetMapping("/add")
	public String addDepartment(Model theModel)
	{
		theModel.addAttribute("leaves", new Leave());
		return "AddLeave";
	}
}
