package com.designpatterns.structuralpattern.composite;

public class CompositeDemo {
	public static void main(String[] args) {
		
		AccountCompositor accComp = new AccountCompositor();
		accComp.addAccount(new DepositeAccount("34567", 15000.0));
		accComp.addAccount(new SavingAccount("34567", 15000.0));
		accComp.addAccount(new DepositeAccount("12344", 15000.0));
		System.out.println("Total Amount: "+accComp.getAmount());
		
		accComp.removeAccount(new DepositeAccount("34567", 15000.0));
		System.out.println("Total Amount: "+accComp.getAmount());
	}
}
