package com.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_leave_details")
public class EmployeeLeaveDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="username")
	private String username;
	
	@Column(name="Casual_Leave")
	private int casual_leave;
	
	@Column(name="Earned_Leave")
	private int earned_leave;
	
	@Column(name="Sick_Leave")
	private int sick_leave;
	
	@Column(name="Marriage_Leave")
	private int marriage_leave;
	
	@Column(name="Paternity_Leave")
	private int paternity_leave;
	
	@Column(name="Bereavement_Leave")
	private int bereavement_Leave;

	public EmployeeLeaveDetail(String username, int casual_leave, int earned_leave, int sick_leave,
			int marriage_leave, int paternity_leave, int bereavement_Leave) {
	
		this.username = username;
		this.casual_leave = casual_leave;
		this.earned_leave = earned_leave;
		this.sick_leave = sick_leave;
		this.marriage_leave = marriage_leave;
		this.paternity_leave = paternity_leave;
		this.bereavement_Leave = bereavement_Leave;
	}

	public EmployeeLeaveDetail() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCasual_leave() {
		return casual_leave;
	}

	public void setCasual_leave(int casual_leave) {
		this.casual_leave = casual_leave;
	}

	public int getEarned_leave() {
		return earned_leave;
	}

	public void setEarned_leave(int earned_leave) {
		this.earned_leave = earned_leave;
	}

	public int getSick_leave() {
		return sick_leave;
	}

	public void setSick_leave(int sick_leave) {
		this.sick_leave = sick_leave;
	}

	public int getMarriage_leave() {
		return marriage_leave;
	}

	public void setMarriage_leave(int marriage_leave) {
		this.marriage_leave = marriage_leave;
	}

	public int getPaternity_leave() {
		return paternity_leave;
	}

	public void setPaternity_leave(int paternity_leave) {
		this.paternity_leave = paternity_leave;
	}

	public int getBereavement_Leave() {
		return bereavement_Leave;
	}

	public void setBereavement_Leave(int bereavement_Leave) {
		this.bereavement_Leave = bereavement_Leave;
	}

	@Override
	public String toString() {
		return "EmployeeLeaveDetail [username=" + username + ", casual_leave=" + casual_leave + ", earned_leave="
				+ earned_leave + ", sick_leave=" + sick_leave + ", marriage_leave=" + marriage_leave
				+ ", paternity_leave=" + paternity_leave + ", bereavement_Leave=" + bereavement_Leave + "]";
	}

	
	
	
	
}
