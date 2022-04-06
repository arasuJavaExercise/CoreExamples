package com.threadspack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	private String message;

	WorkerThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " -> " + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName() + " Completed -> " + message);
	}

}

public class ThreadPoolExample {
	public static void main(String[] args) {

		ExecutorService eService = Executors.newFixedThreadPool(5);

		long end = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++) {
			Runnable runable = new WorkerThread("Task" + i);
			eService.execute(runable);
		}
		long start = System.currentTimeMillis();
		
		
		eService.shutdown();
		while (!eService.isTerminated()) {
		}
		System.out.println("Total Time taken for 2 threads :"+(start - end));
	}
}
