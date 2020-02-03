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
	@GeneratedValue(strategy=GenerationType.AUTO)//AUTO -for auto generated id
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private  String username;
	
	@Column(name="usertype")
	private String usertype;
	
	@Column(name="leavetype")
	private String leavetype;
	
	@Column(name="FromDate")
	private String from_date;
	
	@Column(name="ToDate")
	private String to_date;
	
	@Column(name="Remarks")
	private String remarks;

	@Column(name="status")
	private String status;

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

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LeaveTracking(String username, String usertype, String leavetype, String from_date, String to_date,
			String remarks,String status) {
		
		this.username = username;
		this.usertype = usertype;
		this.leavetype = leavetype;
		this.from_date = from_date;
		this.to_date = to_date;
		this.remarks = remarks;
		this.status = status;
	}

	
	
	@Override
	public String toString() {
		return "LeaveTracking [id=" + id + ", username=" + username + ", usertype=" + usertype + ", leavetype="
				+ leavetype + ", from_date=" + from_date + ", to_date=" + to_date + ", remarks=" + remarks + ", status="
				+ status + "]";
	}

	public LeaveTracking() {
		
	}
	
	
	
}
