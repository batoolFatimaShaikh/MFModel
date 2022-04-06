package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_holdings_debtstated_latest {
	private BigInteger plan_id;
	private Date as_on_date;
	private int percentage;
	private BigInteger asset_id;
	private Timestamp modified_ts;
	public MF_Fund_holdings_debtstated_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_holdings_debtstated_latest(BigInteger plan_id, Date as_on_date, int percentage, BigInteger asset_id,
			Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.percentage = percentage;
		this.asset_id = asset_id;
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
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public BigInteger getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(BigInteger asset_id) {
		this.asset_id = asset_id;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_holdings_debtstated_latest [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", percentage="
				+ percentage + ", asset_id=" + asset_id + ", modified_ts=" + modified_ts + "]";
	}
	
}
