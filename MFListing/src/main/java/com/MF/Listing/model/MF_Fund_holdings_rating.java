package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_holdings_rating {
	private BigInteger plan_id;
	private Date as_on_date;
	private String rating;
	private int percentage;
	private Timestamp modified_ts;
	public MF_Fund_holdings_rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_holdings_rating(BigInteger plan_id, Date as_on_date, String rating, int percentage,
			Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.rating = rating;
		this.percentage = percentage;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_holdings_rating [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", rating=" + rating
				+ ", percentage=" + percentage + ", modified_ts=" + modified_ts + "]";
	}
	
}
