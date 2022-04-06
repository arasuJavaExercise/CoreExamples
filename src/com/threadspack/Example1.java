package com.threadspack;

class MyThreadClass extends Thread {

	public MyThreadClass(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread() + "," + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Example1 {
	public static void main(String[] args) {
		
		MyThreadClass t1 = new MyThreadClass("Thread1");
		MyThreadClass t2 = new MyThreadClass("Thread2");
		
		t2.start();
		t1.start();

	}
}
