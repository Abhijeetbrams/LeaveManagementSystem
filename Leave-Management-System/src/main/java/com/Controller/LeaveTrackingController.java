package com.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.POJO.EmployeeLeaveDetail;
import com.POJO.LeaveTracking;
import com.Service.EmployeeLeaveDetailService;
import com.Service.LeaveTrackingService;

@Controller
@RequestMapping("/leaves")
public class LeaveTrackingController {

	@Autowired
	private LeaveTrackingService leaveService;
	
	@Autowired
	private EmployeeLeaveDetailService employeeLeaveDetailService;
	
	
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
		
		//Accessing the leaves and modifying the leaves back to leave details
		String username=theLeaves.getUsername();
		EmployeeLeaveDetail empLD=employeeLeaveDetailService.findByUsername(username);
		String LeaveType=theLeaves.getLeavetype();
		
		// Getting Date Diff
				String d1=theLeaves.getFrom_date();
				d1=d1+" 23:59:59";
				String d2=theLeaves.getTo_date();
				d2=d2+" 23:59:59";
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD HH:MM:SS");
				long diff=0;
				long diffDays=0;
				try {
				Date	dx1 = format.parse(d1);
				
				 Date dx2 = format.parse(d2);
				  diff= dx2.getTime()-dx1.getTime();
				 diffDays=diff / (24 * 60 * 60 * 1000);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(diff+" "+diffDays);
				

	   //Updating the Leaves on the Basis of Date Range
						
				
		int leave=0;
		int leaveLeft=0;
		if(LeaveType.equalsIgnoreCase("Casual Leave"))
		{
			leave=empLD.getCasual_leave();
			if(leave>=diffDays)
			{
				leaveLeft= leave-(int)diffDays;
				
			}
			else
			{
				throw new RuntimeException("You Don't have that much amount of Leave of this LeaveType");
			}
			empLD.setCasual_leave(leaveLeft);
		}
		else if(LeaveType.equalsIgnoreCase("Earned Leave"))
		{
			leave=empLD.getEarned_leave();
			if(leave>=diffDays)
			{
				leaveLeft= leave-(int)diffDays;
				
			}
			else
			{
				throw new RuntimeException("You Don't have that much amount of Leave of this LeaveType");
			}
			empLD.setEarned_leave(leaveLeft);
		}
		else if(LeaveType.equalsIgnoreCase("Paternity Leave"))
		{
			leave=empLD.getPaternity_leave();
			if(leave>=diffDays)
			{
				leaveLeft= leave-(int)diffDays;
				
			}
			else
			{
				throw new RuntimeException("You Don't have that much amount of Leave of this LeaveType");
			}
			System.out.println("  "+leaveLeft);
			empLD.setPaternity_leave(leaveLeft);
		}
		else if(LeaveType.equalsIgnoreCase("Bereavement Leave"))
		{
			leave=empLD.getBereavement_Leave();
			if(leave>=diffDays)
			{
				leaveLeft= leave-(int)diffDays;
				
			}
			else
			{
				throw new RuntimeException("You Don't have that much amount of Leave of this LeaveType");
			}
			empLD.setBereavement_Leave(leaveLeft);
		}
		
		System.out.println(empLD.toString());
		employeeLeaveDetailService.save(empLD);
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
