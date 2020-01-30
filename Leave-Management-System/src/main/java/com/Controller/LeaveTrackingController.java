package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Service.LeaveTrackingService;

@Controller
@RequestMapping("/leaves")
public class LeaveTrackingController {

	@Autowired
	private LeaveTrackingService leaveService;
	
	@GetMapping("/leaveTracking")
	public String findAll(Model theModel)
	{
		
		theModel.addAttribute("leaves", leaveService.findAll());
		return "Leave-Tracking";
	}	
}
