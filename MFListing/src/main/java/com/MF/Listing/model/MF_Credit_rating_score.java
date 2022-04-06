package com.MF.Listing.model;

import java.sql.Timestamp;

public class MF_Credit_rating_score {
	private int rating_id;
	private String rating;
	private Timestamp modified_ts;
	public MF_Credit_rating_score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Credit_rating_score(int rating_id, String rating, Timestamp modified_ts) {
		super();
		this.rating_id = rating_id;
		this.rating = rating;
		this.modified_ts = modified_ts;
	}
	public int getRating_id() {
		return rating_id;
	}
	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Timestamp isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Timestamp modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "Credit_rating_score [rating_id=" + rating_id + ", rating=" + rating + ", modified_ts=" + modified_ts
				+ "]";
	}
	

}
