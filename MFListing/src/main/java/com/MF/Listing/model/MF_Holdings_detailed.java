package com.MF.Listing.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class MF_Holdings_detailed {
	private BigInteger plan_id;
	private BigInteger company_id;
	private BigInteger asset_id;
	private BigInteger asset_date;
	private int asset_value;
	private BigInteger num_of_shares;
	private int asset_percentage;
	private int coupon_rate;
	private String maturity;
	private BigInteger rating_id;
	private String isin;
	private String rating_raw;
	private Timestamp modified_ts;
	public MF_Holdings_detailed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Holdings_detailed(BigInteger plan_id, BigInteger company_id, BigInteger asset_id, BigInteger asset_date,
			int asset_value, BigInteger num_of_shares, int asset_percentage, int coupon_rate, String maturity,
			BigInteger rating_id, String isin, String rating_raw, Timestamp modified_ts) {
		super();
		this.plan_id = plan_id;
		this.company_id = company_id;
		this.asset_id = asset_id;
		this.asset_date = asset_date;
		this.asset_value = asset_value;
		this.num_of_shares = num_of_shares;
		this.asset_percentage = asset_percentage;
		this.coupon_rate = coupon_rate;
		this.maturity = maturity;
		this.rating_id = rating_id;
		this.isin = isin;
		this.rating_raw = rating_raw;
		this.modified_ts = modified_ts;
	}
	public BigInteger getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(BigInteger plan_id) {
		this.plan_id = plan_id;
	}
	public BigInteger getCompany_id() {
		return company_id;
	}
	public void setCompany_id(BigInteger company_id) {
		this.company_id = company_id;
	}
	public BigInteger getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(BigInteger asset_id) {
		this.asset_id = asset_id;
	}
	public BigInteger getAsset_date() {
		return asset_date;
	}
	public void setAsset_date(BigInteger asset_date) {
		this.asset_date = asset_date;
	}
	public int getAsset_value() {
		return asset_value;
	}
	public void setAsset_value(int asset_value) {
		this.asset_value = asset_value;
	}
	public BigInteger getNum_of_shares() {
		return num_of_shares;
	}
	public void setNum_of_shares(BigInteger num_of_shares) {
		this.num_of_shares = num_of_shares;
	}
	public int getAsset_percentage() {
		return asset_percentage;
	}
	public void setAsset_percentage(int asset_percentage) {
		this.asset_percentage = asset_percentage;
	}
	public int getCoupon_rate() {
		return coupon_rate;
	}
	public void setCoupon_rate(int coupon_rate) {
		this.coupon_rate = coupon_rate;
	}
	public String getMaturity() {
		return maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
	public BigInteger getRating_id() {
		return rating_id;
	}
	public void setRating_id(BigInteger rating_id) {
		this.rating_id = rating_id;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getRating_raw() {
		return rating_raw;
	}
	public void setRating_raw(String rating_raw) {
		this.rating_raw = rating_raw;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Holdings_detailed [plan_id=" + plan_id + ", company_id=" + company_id + ", asset_id=" + asset_id
				+ ", asset_date=" + asset_date + ", asset_value=" + asset_value + ", num_of_shares=" + num_of_shares
				+ ", asset_percentage=" + asset_percentage + ", coupon_rate=" + coupon_rate + ", maturity=" + maturity
				+ ", rating_id=" + rating_id + ", isin=" + isin + ", rating_raw=" + rating_raw + ", modified_ts="
				+ modified_ts + "]";
	}
	
}
