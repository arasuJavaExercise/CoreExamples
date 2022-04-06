package com.designpatterns.structuralpattern.composite;

public class SavingAccount implements Account {

	private String accountNumber;
	private double amount;

	public SavingAccount(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		return this.amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SavingAccount) {
			SavingAccount sAcc = (SavingAccount) obj;
			return (this.accountNumber.equals(sAcc.accountNumber));
		}
		return false;

	}

}
