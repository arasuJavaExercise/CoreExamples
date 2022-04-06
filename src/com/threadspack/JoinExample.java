package com.threadspack;

public class JoinExample {

	public static void runThread() {
		for (int i = 1; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(JoinExample::runThread, "Arasu");
		Thread t2 = new Thread(JoinExample::runThread, "Kumar");
		Thread t3 = new Thread(JoinExample::runThread, "Gowda");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();

	}

}
