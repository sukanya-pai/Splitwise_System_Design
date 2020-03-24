package com.splitwise.model;

public class User {

	private String name;
	private String email;
	private String phoneNumer;
	private long uId;
	
	private static long NEW_UID = 0;
	
	public User(String name, String email, String phNo) {
		
		setUid();
		setName(name);
		setEmail(email);
		setPhoneNumer(phNo);
	}
	
	private void setUid() {
		this.uId = NEW_UID++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	
	
	
}
