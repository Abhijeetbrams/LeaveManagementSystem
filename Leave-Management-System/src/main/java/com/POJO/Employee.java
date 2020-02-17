package com.POJO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String username;	
	
	
	@Column(name="department")
	private String department;
	
	@Column(name="full_name")
	private String full_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="reporting")
	private String reporting;
	
	@Pattern(regexp="^[789][0-9]{9}$",message="Enter Valid PhoneNumber")
	@Column(name="phone_number")
	private String phone_number;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReporting() {
		return reporting;
	}

	public void setReporting(String reporting) {
		this.reporting = reporting;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	
	

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", department=" + department + ", full_name="
				+ full_name + ", email=" + email + ", designation=" + designation + ", reporting=" + reporting
				+ ", phone_number=" + phone_number + "]";
	}

	public Employee(String username, String department, String full_name, String email, String designation,
			String reporting, String phone_number) {
		
		this.username = username;
		this.department = department;
		this.full_name = full_name;
		this.email = email;
		this.designation = designation;
		this.reporting = reporting;
		this.phone_number = phone_number;
	}

	public Employee() {
		
	}

	
	
	
	
	
}
