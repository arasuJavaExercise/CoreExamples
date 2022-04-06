package com.designpatterns.structuralpattern.composite;

public class DepositeAccount implements Account {

	private String accountNumber;
	private double amount;

	public DepositeAccount(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		return this.amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DepositeAccount) {
			DepositeAccount sAcc = (DepositeAccount) obj;
			return (this.accountNumber.equals(sAcc.accountNumber));
		}
		return false;

	}
}
