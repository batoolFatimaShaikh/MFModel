package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Composition {

	private BigInteger plan_id;
	private Date as_on_date;
	private int equity;
	private int debt; 
	private int others;
	private int commodities;
	private Timestamp modified_ts;
	public MF_Composition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Composition(BigInteger plan_id, Date as_on_date, int equity, int debt, int others, int commodities,
			Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.equity = equity;
		this.debt = debt;
		this.others = others;
		this.commodities = commodities;
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
	public int getEquity() {
		return equity;
	}
	public void setEquity(int equity) {
		this.equity = equity;
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public int getCommodities() {
		return commodities;
	}
	public void setCommodities(int commodities) {
		this.commodities = commodities;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "Composition [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", equity=" + equity + ", debt="
				+ debt + ", others=" + others + ", commodities=" + commodities + ", modified_ts=" + modified_ts + "]";
	}
	
	
	
}
