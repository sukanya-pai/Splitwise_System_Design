package com.splitwise.model.split;

import com.splitwise.model.User;

public abstract class Split {
	
	private User user;
	private double amount;
	private String note;
	private long uId;
	
	private static long NEW_UID = 0;
	
	
	private long getuId() {
		return uId;
	}

	private void setuId() {
		this.uId = NEW_UID++;
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
