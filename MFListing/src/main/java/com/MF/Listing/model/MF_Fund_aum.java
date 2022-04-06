package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_aum {

	private BigInteger plan_id;
	private Date as_on_date;
	private int aum;
	private Timestamp modified_ts;
	public MF_Fund_aum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_aum(BigInteger plan_id, Date as_on_date, int aum, Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.aum = aum;
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
	public int getAum() {
		return aum;
	}
	public void setAum(int aum) {
		this.aum = aum;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_aum [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", aum=" + aum + ", modified_ts="
				+ modified_ts + "]";
	}
	
}
