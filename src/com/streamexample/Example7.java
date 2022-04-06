package com.streamexample;

import java.util.List;

/**
 * programs examples of aggregate intermediate sorted operation
 */
public class Example7 {
	public static void main(String[] args) {
		List<Person> listPersons = Person.loadRecords();
		
		// the following example sort person by their age in ascending order
		System.out.println("Sort Person as per Age in Ascending Order");
		listPersons.stream().sorted().forEach(System.out::println);
		
		// the following example sort person by their firstname in descending order
		System.out.println("\nSort Person Firstname in Descending Order");
		listPersons.stream()
		.sorted((t1,t2)->t2.getFirstName().compareTo(t1.getFirstName()))
		.forEach(System.out::println);
		
	}
}
