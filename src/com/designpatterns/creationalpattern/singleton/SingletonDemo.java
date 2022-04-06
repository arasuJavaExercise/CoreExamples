package com.designpatterns.creationalpattern.singleton;

public class SingletonDemo {
	public static void main(String[] args) {

		// Eager initialization
		System.out.println("Eager init demo ");
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		System.out.println(eagerSingleton1.hashCode());
		System.out.println(eagerSingleton2.hashCode());

		// Lazy Initialization
		System.out.println("\nLazy init demo ");
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1.hashCode());
		System.out.println(lazySingleton2.hashCode());

		
		// Multithreaded Singleton with synchronization method
		System.out.println("\nMultithread (method level) init demo ");
		MultiThreadedSingleton threadSingleton1 = MultiThreadedSingleton.getInstance();
		MultiThreadedSingleton threadSingleton2 = MultiThreadedSingleton.getInstance();
		System.out.println(threadSingleton1.hashCode());
		System.out.println(threadSingleton2.hashCode());
		
		// Multithreaded Singleton with synchronization block
		System.out.println("\nMultithread (block or class level) init demo ");
		MultiThreadSingletonBlock tSingleton1 = MultiThreadSingletonBlock.getInstance(); 
		MultiThreadSingletonBlock tSingleton2 = MultiThreadSingletonBlock.getInstance();
		System.out.println(tSingleton1.hashCode());
		System.out.println(tSingleton2.hashCode());
		
	}
}
