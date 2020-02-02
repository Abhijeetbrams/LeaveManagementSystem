package com.SpringSecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.ModelAttribute;

//import com.POJO.UserCreds;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(datasource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers( "/css/**","/images/**","/authenticateTheUser").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		   .loginPage("/showMyLoginPage")
		   .loginProcessingUrl("/authenticateTheUser")
		   .permitAll()
		   .and()
		   .logout().permitAll();
		//System.out.println("THSJBJDJKJSDNDJJKSJD");
	}
	
	
	

}
