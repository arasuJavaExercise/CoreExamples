package com.designpatterns.creationalpattern.singleton;
/**
 * This is example of EARLY SINGLETON INSTANCE
 *
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
