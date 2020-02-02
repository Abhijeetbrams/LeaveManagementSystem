package com.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PoincutExpressions {
         
	@Pointcut("execution(* com.Controller.LoginController.homePage(..))")
	public void forUserName(){}
}
