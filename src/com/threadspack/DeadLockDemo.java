package com.threadspack;

public class DeadLockDemo {
	public static void main(String[] args) {

		String resource1 = "ratan jaiswal";
		String resource2 = "vimal jaiswal";

		Thread t1 = new Thread() {

			public void run() {

				synchronized (resource1) {
					System.out.println("Thread 1: Hold Resource 1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource2) {
						System.out.println("Thread 1: Hold Resource 2");
					}
				}
			}

		};

		Thread t2 = new Thread() {

			public void run() {

				synchronized (resource2) {
					System.out.println("Thread 2: Hold Resource 2");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource1) {
						System.out.println("Thread 2: Hold Resource 1");
					}
				}
			}

		};

		t1.start();
		t2.start();
	}
}
