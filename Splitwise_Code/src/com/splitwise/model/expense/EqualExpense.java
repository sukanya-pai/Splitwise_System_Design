package com.splitwise.model.expense;

import java.util.Date;
import java.util.List;

import com.splitwise.model.User;
import com.splitwise.model.split.Split;

public class EqualExpense extends Expense {

	public EqualExpense(String name, Date date, User addedBy, User paidBy, String catagory, double totalAmount) {
		super(name, date, addedBy, paidBy, catagory, totalAmount);
	}
	
	boolean validate() {
		super.validate();
		return false;
	}

	@Override
	void updateBalance() {
		
		List<Split> splits = getSplits();
		int size = splits.size();
		for(Split s : splits) {
			s.setAmount(getTotalAmount()/size);
		}
	}

}
