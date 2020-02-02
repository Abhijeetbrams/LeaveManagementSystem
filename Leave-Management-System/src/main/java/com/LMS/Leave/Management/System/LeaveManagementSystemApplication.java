package com.LMS.Leave.Management.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan({"com.Controller","com.SpringSecurity","com.Service","com.Aspect"})
@EntityScan("com.POJO")
@EnableJpaRepositories("com.DAO")
//@SpringBootApplication( scanBasePackages={
//	     "com.Controller","com.SpringSecurity","com.POJO","com.DAO","com.Service"})
public class LeaveManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementSystemApplication.class, args);
	}

}
	