package com.threadspack;

public class ThreadPriorityExample {

	public static void display() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(ThreadPriorityExample::display, "Thread 1");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(ThreadPriorityExample::display, "Thread 2");
		t2.setPriority(Thread.MIN_PRIORITY);
		Thread t3 = new Thread(ThreadPriorityExample::display, "Thread 3");
		t3.setPriority(Thread.NORM_PRIORITY);
		Thread t4 = new Thread(ThreadPriorityExample::display, "Thread 4");
		t4.setPriority(Thread.MIN_PRIORITY);
		Thread t5 = new Thread(ThreadPriorityExample::display, "Thread 5");
		t5.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
