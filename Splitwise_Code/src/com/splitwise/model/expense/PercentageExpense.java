package com.splitwise.model.expense;

import java.util.Date;

import com.splitwise.model.User;

public class PercentageExpense extends Expense {

	public PercentageExpense(String name, Date date, User addedBy, User paidBy, String catagory, double totalAmount) {
		super(name, date, addedBy, paidBy, catagory, totalAmount);
	}

	@Override
	void updateBalance() {
		// TODO Auto-generated method stub
		
	}

}
