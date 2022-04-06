package com.designpatterns.creationalpattern.singleton;

public class MultiThreadedSingleton {
	private static MultiThreadedSingleton instance = null;

	private MultiThreadedSingleton() {
	}

	public static synchronized MultiThreadedSingleton getInstance() {
		if (instance == null) {
			instance = new MultiThreadedSingleton();
		}
		return instance;
	}
}
