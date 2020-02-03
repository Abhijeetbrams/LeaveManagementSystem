package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.POJO.LeaveTracking;
import com.Service.LeaveTrackingService;

@Controller
@RequestMapping("/leaves")
public class LeaveTrackingController {

	@Autowired
	private LeaveTrackingService leaveService;
	
	@GetMapping("/leaveTracking")
	public String findAll(Model theModel,Authentication authentication)
	{
		theModel.addAttribute("username",authentication.getName());
		//authentication.getAuthorities();
		theModel.addAttribute("role", authentication.getAuthorities());
		theModel.addAttribute("leaves", leaveService.findAll());
		return "Leave-Tracking";
	}
	
	@PostMapping("/adding")
	public String save(@ModelAttribute("leaves") LeaveTracking theLeaves,Model theModel)
	{
		leaveService.save(theLeaves);
		theModel.addAttribute("message","Successfully Saved to DB");
		return "LeaveApply";
	}
	
	@GetMapping("/status")
	public String setUserInfoById(@RequestParam("id") int theId,Model theModel,
			@RequestParam("status") String status)
	{
		LeaveTracking leave=leaveService.findById(theId);
		leave.setStatus(status);
		leaveService.save(leave);
		theModel.addAttribute("message","Successfully Updated");
		return "redirect:/leaves/leaveTracking";
	}
	
}
