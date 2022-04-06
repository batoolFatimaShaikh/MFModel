package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class MF_Fund_categories {

	private BigInteger category_id;
	private String primary_category_name;
	private String category_name;
	private Timestamp modified_ts;
	private boolean is_active;
	public MF_Fund_categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_categories(BigInteger category_id, String primary_category_name, String category_name,
			Timestamp modified_ts, boolean is_active) {
		super();
		this.category_id = category_id;
		this.primary_category_name = primary_category_name;
		this.category_name = category_name;
		this.modified_ts = modified_ts;
		this.is_active = is_active;
	}
	public BigInteger getCategory_id() {
		return category_id;
	}
	public void setCategory_id(BigInteger category_id) {
		this.category_id = category_id;
	}
	public String getPrimary_category_name() {
		return primary_category_name;
	}
	public void setPrimary_category_name(String primary_category_name) {
		this.primary_category_name = primary_category_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "MF_Fund_categories [category_id=" + category_id + ", primary_category_name=" + primary_category_name
				+ ", category_name=" + category_name + ", modified_ts=" + modified_ts + ", is_active=" + is_active
				+ "]";
	}
	

}
