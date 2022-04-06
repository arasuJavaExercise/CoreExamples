package com.threadspack;

class Customer {

	public static int amount;

	public Customer() {
		amount = 10000;
	}

	public synchronized void withDrawAmount(int amount) {

		if (Customer.amount <= amount) {
			System.out.println("Amount shortage in back. Please wait... ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			amount -= amount;
			System.out.println("Amount Withdraw successfully");
		}
	}

	public synchronized void depositeAmount(int amount) {

		System.out.println("Amount Transferrring...");
		amount += amount;
		System.out.println("Amount Deposited From Bank Server");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

}

public class InterThreadDemo {

	public static void main(String[] args) {

		Customer cust = new Customer();

		
		new Thread(){
			public void run(){
				cust.withDrawAmount(15000);
			}
		}.start();
		
		
		new Thread(){
			public void run(){
				cust.depositeAmount(15000);
			}
		}.start();
		

	}

}
