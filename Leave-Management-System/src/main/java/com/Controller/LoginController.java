package com.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.POJO.LeaveTracking;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

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
		
		return "Homepage";
	}
	
	@GetMapping("/applyleave")
	public String applyLeave(Model theModel,Authentication authentication)
	{
		theModel.addAttribute("username",authentication.getName());
		theModel.addAttribute("leaves", new LeaveTracking());
		return "LeaveApply";
	}
}
