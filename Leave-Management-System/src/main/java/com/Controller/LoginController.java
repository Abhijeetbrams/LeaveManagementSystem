package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String loginPage()
	{
		//System.out.println("Custom login");
		return "CustomAuthLoginForm";
	}
	
	@GetMapping("/")
	public String homePage()
	{
		return "Homepage";
	}
}
