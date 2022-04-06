package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class MF_Industry {
	private int industry_code;
	private int sector_code;
	private String industry_name;
	private Timestamp modified_ts;
	public MF_Industry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Industry(int industry_code, int sector_code, String industry_name, Timestamp modified_ts) {
		super();
		this.industry_code = industry_code;
		this.sector_code = sector_code;
		this.industry_name = industry_name;
		this.modified_ts = modified_ts;
	}
	public int getIndustry_code() {
		return industry_code;
	}
	public void setIndustry_code(int industry_code) {
		this.industry_code = industry_code;
	}
	public int getSector_code() {
		return sector_code;
	}
	public void setSector_code(int sector_code) {
		this.sector_code = sector_code;
	}
	public String getIndustry_name() {
		return industry_name;
	}
	public void setIndustry_name(String industry_name) {
		this.industry_name = industry_name;
	}
	public Timestamp getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Industry [industry_code=" + industry_code + ", sector_code=" + sector_code + ", industry_name="
				+ industry_name + ", modified_ts=" + modified_ts + "]";
	}
	
}
