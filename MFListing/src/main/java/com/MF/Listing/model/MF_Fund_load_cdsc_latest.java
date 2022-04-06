package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class MF_Fund_load_cdsc_latest {
	private BigInteger plan_id;
	private Date as_on_date;
	private int cdsc;
	private String start_operand;
	private BigInteger period_start;
	private String end_operand;
	private BigInteger period_end;
	private int percentage;
	private Timestamp modified_ts;
	public MF_Fund_load_cdsc_latest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_load_cdsc_latest(BigInteger plan_id, Date as_on_date, int cdsc, String start_operand,
			BigInteger period_start, String end_operand, BigInteger period_end, int percentage, Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.as_on_date = as_on_date;
		this.cdsc = cdsc;
		this.start_operand = start_operand;
		this.period_start = period_start;
		this.end_operand = end_operand;
		this.period_end = period_end;
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
	public int getCdsc() {
		return cdsc;
	}
	public void setCdsc(int cdsc) {
		this.cdsc = cdsc;
	}
	public String getStart_operand() {
		return start_operand;
	}
	public void setStart_operand(String start_operand) {
		this.start_operand = start_operand;
	}
	public BigInteger getPeriod_start() {
		return period_start;
	}
	public void setPeriod_start(BigInteger period_start) {
		this.period_start = period_start;
	}
	public String getEnd_operand() {
		return end_operand;
	}
	public void setEnd_operand(String end_operand) {
		this.end_operand = end_operand;
	}
	public BigInteger getPeriod_end() {
		return period_end;
	}
	public void setPeriod_end(BigInteger period_end) {
		this.period_end = period_end;
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
		return "MF_Fund_load_cdsc_latest [plan_id=" + plan_id + ", as_on_date=" + as_on_date + ", cdsc=" + cdsc
				+ ", start_operand=" + start_operand + ", period_start=" + period_start + ", end_operand=" + end_operand
				+ ", period_end=" + period_end + ", percentage=" + percentage + ", modified_ts=" + modified_ts + "]";
	}
	
}
