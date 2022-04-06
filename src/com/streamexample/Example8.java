package com.streamexample;

import java.util.Arrays;
import java.util.List;

/**
 * programs examples of aggregate intermediate distinct operation
 */
public class Example8 {

	public static void main(String[] args) {
		
		List<Person> listPersons = Person.loadRecords();
		
		// the following example displays distinct number by remove duplicates
		System.out.println("Displays distinct number by remove duplicates");
		int num[] = { 23, 13, 44, 22, 65, 7, 1, 55, 12, 54, 44, 22, 55, 23 };
		Arrays.stream(num)
		.distinct()
		.forEach(t -> System.out.print(t + " "));
		
		// the following example shows distinct last names of the persons in the 
		// above list, and sorts them by alphabetic order
		System.out.println("\nDisplays last names of the persons in the above list, and "
				+ "sorts them by alphabetic order");
		listPersons.stream()
	    .map(p -> p.getLastName())
	    .distinct()
	    .sorted()
	    .forEach(System.out::println);
		
	}

}
