package com.MF.Listing.model;

import java.math.BigInteger;

public class MF_Companies {
	private BigInteger company_id;
	private String full_name;
	private String short_name;
	private boolean modified_ts;
	private String country_code;
	private int industry_code;
	private BigInteger entity_group_id;
	public MF_Companies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Companies(BigInteger company_id, String full_name, String short_name, boolean modified_ts,
			String country_code, int industry_code, BigInteger entity_group_id) {
		super();
		this.company_id = company_id;
		this.full_name = full_name;
		this.short_name = short_name;
		this.modified_ts = modified_ts;
		this.country_code = country_code;
		this.industry_code = industry_code;
		this.entity_group_id = entity_group_id;
	}
	public BigInteger getCompany_id() {
		return company_id;
	}
	public void setCompany_id(BigInteger company_id) {
		this.company_id = company_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public boolean isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(boolean modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public int getIndustry_code() {
		return industry_code;
	}
	public void setIndustry_code(int industry_code) {
		this.industry_code = industry_code;
	}
	public BigInteger getEntity_group_id() {
		return entity_group_id;
	}
	public void setEntity_group_id(BigInteger entity_group_id) {
		this.entity_group_id = entity_group_id;
	}
	@Override
	public String toString() {
		return "Companies [company_id=" + company_id + ", full_name=" + full_name + ", short_name=" + short_name
				+ ", modified_ts=" + modified_ts + ", country_code=" + country_code + ", industry_code=" + industry_code
				+ ", entity_group_id=" + entity_group_id + "]";
	}
	
	
}
