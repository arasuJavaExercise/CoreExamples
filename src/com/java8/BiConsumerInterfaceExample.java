package com.java8;

import java.util.function.*;
import java.util.*;


public class BiConsumerInterfaceExample {

	static void ShowDetails(String name, Integer age) {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
//		// Referring method
//		BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample::ShowDetails;
//		biCon.accept("Rama", 20);
//		biCon.accept("Shyam", 25);
//		// Using lambda expression
//		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
//		biCon2.accept("Peter", 28);
		
		
		List<Integer> numList = new ArrayList<>();
	      numList.add(5);
	      numList.add(10);
	      numList.add(15);
	      numList.add(20);
	      numList.add(25);
	      numList.add(30);
	      numList.add(35);
	      numList.add(40);
	      Predicate<Integer> pred = i -> i > 15;
	      System.out.println(pred.test(13));
	      
	      numList.stream().filter(pred).forEach(i -> System.out.println(i));
	}

}
