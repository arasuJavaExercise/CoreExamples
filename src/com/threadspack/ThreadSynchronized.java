package com.threadspack;

class MyTable {

	synchronized public void displayTable(int num) {

		System.out.println("Calling " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 implements Runnable {

	private MyTable myTable;

	public Thread1(MyTable myTable) {
		this.myTable = myTable;
	}

	@Override
	public void run() {
		myTable.displayTable(5);
	}

}

class Thread2 implements Runnable {

	private MyTable myTable;

	public Thread2(MyTable myTable) {
		this.myTable = myTable;
	}

	@Override
	public void run() {
		myTable.displayTable(100);
	}

}

public class ThreadSynchronized {

	public static void main(String[] args) {

		MyTable myTableObj = new MyTable();
		Thread t1 = new Thread(new Thread1(myTableObj), "Thread 1");
		t1.start();
		Thread t2 = new Thread(new Thread2(myTableObj), "Thread 2");
		t2.start();
	}

}
