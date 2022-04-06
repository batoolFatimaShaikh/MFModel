package com.MF.Listing.model;

import java.sql.Timestamp;

public class MF_Fund_type {
	private int type_id;
	private String type_name;
	private Timestamp modified_ts;
	public MF_Fund_type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_type(int type_id, String type_name, Timestamp modified_ts) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.modified_ts = modified_ts;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_type [type_id=" + type_id + ", type_name=" + type_name + ", modified_ts=" + modified_ts + "]";
	}
	
}
