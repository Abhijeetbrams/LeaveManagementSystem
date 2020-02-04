package com.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LeaveType")
public class Leave {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="leavetype")
	private String leavetype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public Leave(String leavetype) {
		
		this.leavetype = leavetype;
	}

	public Leave() {
		
	}

	@Override
	public String toString() {
		return "Leave [id=" + id + ", leavetype=" + leavetype + "]";
	}

	
	
}
