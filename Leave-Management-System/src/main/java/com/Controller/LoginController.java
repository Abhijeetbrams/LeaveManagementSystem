package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.POJO.Employee;
import com.POJO.Leave;
import com.POJO.LeaveTracking;
import com.Service.LeaveService;

@Controller
public class LoginController {

	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/showMyLoginPage")
	public String loginPage(Model theModel)
	{
		//System.out.println("Custom login");
		//theModel.addAttribute("username","");
		//System.out.println();
		return "CustomAuthLoginForm";
	}
	
	/*@PostMapping("/authenticateTheUser")
	public String getUsername(@ModelAttribute("usercreds") UserCreds theUsercreds)
	{
		System.out.println("Username: "+ theUsercreds.getUsername()+" "+theUsercreds);
		System.out.println("Thebhvd");
		return "redirect:/HomePage.jsp";
	}
	*/
	@GetMapping("/")
	public String homePage(Authentication authentication,Model theModel)
	{
		theModel.addAttribute("username",authentication.getName());
		//authentication.getAuthorities();
		theModel.addAttribute("role", authentication.getAuthorities());
		//System.out.println(authentication.getName());
		theModel.addAttribute("employee",new Employee() );
		return "Homepage";
	}
	
	@GetMapping("/applyleave")
	public String applyLeave(Model theModel,Authentication authentication)
	{
		String username=authentication.getName();
		theModel.addAttribute("username",username);
		List<Leave> theLeaves=leaveService.findAll();
		theModel.addAttribute("theLeaves", theLeaves);
		for(int i=0;i<theLeaves.size();i++)
		{
			System.out.print(theLeaves.get(i).getLeavetype()+" ");
		}
		
		System.out.println(theLeaves.toString());
		theModel.addAttribute("leaves", new LeaveTracking());
		return "LeaveApply";
	}
}
