package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_load_latest {
	private BigInteger plan_id;
	private Date as_on_date;
	private int front_load;
	private int back_load;
	private String note;
	private Timestamp modified_ts;
	public MF_Fund_load_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_load_latest(BigInteger plan_id, Date as_on_date, int front_load, int back_load, String note,
			Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.front_load = front_load;
		this.back_load = back_load;
		this.note = note;
		this.modified_ts = modified_ts;
	}
	public BigInteger getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(BigInteger plan_id) {
		this.plan_id = plan_id;
	}
	public Date getAs_on_date() {
		return as_on_date;
	}
	public void setAs_on_date(Date as_on_date) {
		this.as_on_date = as_on_date;
	}
	public int getFront_load() {
		return front_load;
	}
	public void setFront_load(int front_load) {
		this.front_load = front_load;
	}
	public int getBack_load() {
		return back_load;
	}
	public void setBack_load(int back_load) {
		this.back_load = back_load;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_load_latest [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", front_load=" + front_load
				+ ", back_load=" + back_load + ", note=" + note + ", modified_ts=" + modified_ts + "]";
	}
	
}
