package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String loginPage()
	{
		//System.out.println("Custom login");
		return "CustomAuthLoginForm";
	}
}
