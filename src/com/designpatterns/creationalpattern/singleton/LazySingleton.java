package com.designpatterns.creationalpattern.singleton;
/**
 * This is example of LAZY SINGLETON INSTANCE
 *
 */
public class LazySingleton {
	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
