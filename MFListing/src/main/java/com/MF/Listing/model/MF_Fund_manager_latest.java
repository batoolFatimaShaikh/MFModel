package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_manager_latest {
	private BigInteger plan_id;
	private BigInteger person_id;
	private Date date_from;
	private Timestamp modified_ts;
	private String person_type;
	public MF_Fund_manager_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_manager_latest(BigInteger plan_id, BigInteger person_id, Date date_from, Timestamp modified_ts,
			String person_type) {
		super();
		this.plan_id = plan_id;
		this.person_id = person_id;
		this.date_from = date_from;
		this.modified_ts = modified_ts;
		this.person_type = person_type;
	}
	public BigInteger getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(BigInteger plan_id) {
		this.plan_id = plan_id;
	}
	public BigInteger getPerson_id() {
		return person_id;
	}
	public void setPerson_id(BigInteger person_id) {
		this.person_id = person_id;
	}
	public Date getDate_from() {
		return date_from;
	}
	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getPerson_type() {
		return person_type;
	}
	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}
	@Override
	public String toString() {
		return "MF_Fund_manager_latest [plan_id=" + plan_id + ", person_id=" + person_id + ", date_from=" + date_from
				+ ", modified_ts=" + modified_ts + ", person_type=" + person_type + "]";
	}
	
	
	
}
