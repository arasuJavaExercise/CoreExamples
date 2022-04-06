package com.designpatterns.creationalpattern.singleton;

public class MultiThreadSingletonBlock {
	private static MultiThreadSingletonBlock instance = null;

	private MultiThreadSingletonBlock() {
	}

	public static MultiThreadSingletonBlock getInstance() {

		if (instance == null) {
			synchronized (MultiThreadSingletonBlock.class) {
				if (instance == null) {
					instance = new MultiThreadSingletonBlock();
				}
			}
		}

		return instance;
	}
}
