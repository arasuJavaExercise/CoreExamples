package com.designpatterns.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class AccountCompositor implements Account {

	List<Account> accList = new ArrayList<>();

	public void addAccount(Account acc) {
		accList.add(acc);
	}

	public void removeAccount(Account acc) {
		accList.remove(acc);
	}

	@Override
	public double getAmount() {
		float totAccount = 0.0f;
		for (Account acc : accList) {
			totAccount += acc.getAmount();
		}
		return totAccount;
	}

}
