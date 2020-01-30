package com.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LeaveTracking")
public class LeaveTracking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user")
	private  String user_name;
	
	@Column(name="username")
	private String user_type;
	
	@Column(name="usertype")
	private String leave_type;
	
	@Column(name="FromDate")
	private String from_date;
	
	@Column(name="ToDate")
	private String to_date;
	
	@Column(name="Remarks")
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getLeave_type() {
		return leave_type;
	}

	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "LeaveTracking [id=" + id + ", user_name=" + user_name + ", user_type=" + user_type + ", leave_type="
				+ leave_type + ", from_date=" + from_date + ", to_date=" + to_date + ", remarks=" + remarks + "]";
	}

	public LeaveTracking(String user_name, String user_type, String leave_type, String from_date, String to_date,
			String remarks) {
		
		this.user_name = user_name;
		this.user_type = user_type;
		this.leave_type = leave_type;
		this.from_date = from_date;
		this.to_date = to_date;
		this.remarks = remarks;
	}

	public LeaveTracking() {
		
	}
	
	
	
}
