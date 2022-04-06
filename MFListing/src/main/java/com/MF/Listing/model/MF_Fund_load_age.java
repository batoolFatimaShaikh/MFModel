package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_load_age {

	private BigInteger plan_id;
	private Date as_on_date;
	private int load_value;
	private BigInteger period_start;
	private BigInteger period_end;
	private Timestamp modified_ts;
	public MF_Fund_load_age() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_load_age(BigInteger plan_id, Date as_on_date, int load_value, BigInteger period_start,
			BigInteger period_end, Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.load_value = load_value;
		this.period_start = period_start;
		this.period_end = period_end;
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
	public int getLoad_value() {
		return load_value;
	}
	public void setLoad_value(int load_value) {
		this.load_value = load_value;
	}
	public BigInteger getPeriod_start() {
		return period_start;
	}
	public void setPeriod_start(BigInteger period_start) {
		this.period_start = period_start;
	}
	public BigInteger getPeriod_end() {
		return period_end;
	}
	public void setPeriod_end(BigInteger period_end) {
		this.period_end = period_end;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_load_age [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", load_value=" + load_value
				+ ", period_start=" + period_start + ", period_end=" + period_end + ", modified_ts=" + modified_ts
				+ "]";
	}
	
}
