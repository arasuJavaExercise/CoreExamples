package com.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {

	// public void display(String)

	public static void main(String[] args) {

		List<String> sports = new ArrayList<>();
		sports.add("Cricket");
		sports.add("FootBall");
		sports.add("Hockey");
		sports.add("Batmiton");
		sports.add("Tennis");
		sports.add("Swimming");

		Consumer<String> consumer = item -> System.out.println(item);
		Predicate<String> predicate = item -> {
			if (item.equalsIgnoreCase("Hockey"))
				return true;
			else
				return false;
		};

		Supplier<Integer> supplier = () -> {
			Random rand = new Random();
			return rand.nextInt(1000);
		};

		System.out.println(predicate.test("FootBall"));
		sports.stream().filter(predicate).forEach(consumer);
		System.out.println("Supplier supplied value: " + supplier.get());

	}

}