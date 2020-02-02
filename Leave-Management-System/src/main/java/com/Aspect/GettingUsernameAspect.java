package com.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GettingUsernameAspect {

	@After("com.Aspect.PoincutExpressions.forUserName()")
	public void gettingUsername() {
		System.out.println("I got it!");
	}
}
