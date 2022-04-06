package com.streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

/**
 * programs examples of aggregate terminal reduce operation
 *
 */
public class Example15 {

	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();

		// program to sum/add the given numbers using reduce operation
		System.out.println("1. Sum or add the elements in list using reduce operation");
		Integer num[] = { 21, 3, 1, 4, 2, 5, 7, 11, 2 };
		int intSum = Arrays.stream(num).reduce(0, (num1, num2) -> num1 + num2);

		Double doublenumbers[] = { 21.1, 3.3, 1.4, 4.1, 2.3, 5.5, 7.7, 11.1, 2.1 };
		double doubleSum = Arrays.stream(doublenumbers).reduce(0.0, (num1, num2) -> num1 + num2);

		Float floatArr[] = { 10.1f, 11.3f };
		float floatSum = Arrays.stream(floatArr).reduce(0.0f, (num1, num2) -> num1 + num2);

		System.out.println("Integer Sum : " + intSum);
		System.out.println("Double Sum : " + doubleSum);
		System.out.println("Floating Sum : " + floatSum);

		// program to concatenate the firstname with comma(,) from the person
		// list
		System.out.println("\n2.Concatenate firstname with comma (,) from the person list");
		Function<Person, String> fNameFunc = t -> t.getFirstName();
		Optional<String> concatenateStr = listPersons.stream().map(fNameFunc)
				.reduce((name1, name2) -> name1 + "," + name2);
		if (concatenateStr.isPresent()) {
			String concatenated = concatenateStr.get();
			System.out.println(concatenated);
		}

	}

}
