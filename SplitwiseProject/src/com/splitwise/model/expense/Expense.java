package com.splitwise.model.expense;

import java.util.Date;
import java.util.List;

import com.splitwise.model.User;
import com.splitwise.model.split.Split;

public abstract class Expense {
	
	private long uId; //unique id
	private String name;
	private Date date;
	private User addedBy;
	private User paidBy;
	private String catagory;
	private double totalAmount;
	private List<Split> splits; //runtime polymorphism
	//[{user1: 49.50}, {user2: 33}, 	]		
	
	//99
	
	
	private static long NEW_UID = 0;


	public Expense(String name, Date date, User addedBy, User paidBy, String catagory, double totalAmount) {
		//todo: Use Builder 
		super();
		//use setters
		this.uId = NEW_UID++;
		this.name = name;
		this.date = date;
		this.addedBy = addedBy;
		this.paidBy = paidBy;
		this.catagory = catagory;
		this.totalAmount = totalAmount;
	}
	
	boolean validate() {
		// common logic
		//the sum of amounts should be equal to the total amount
		double sum = 0;
		for(Split s:splits) {
			sum+=s.getAmount();
		}
		if(sum == totalAmount) //todo:Util.isApproxEqual(sum,totalAmount ) 
			{
			return true;
		}
		return false;
	}
	
	//After adding/removing splits we will have to recalculate the amount of each split.
	//the amount would depend on what type of split is it
	abstract void updateBalance();
	
	public void setSplits(List<Split> splits) {
		this.splits = splits;
		//validate the split
		
	}
	public List<Split> getSplits(){
		return this.splits;
	}
	
	public void removeSplit(Split s) {
		splits.remove(s);
		updateBalance();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(User addedBy) {
		this.addedBy = addedBy;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
