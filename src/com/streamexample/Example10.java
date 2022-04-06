package com.streamexample;

import java.util.List;

/**
 * programs examples of aggregate intermediate skip operation
 */
public class Example10 {
	public static void main(String[] args) {
		
		List<Person> listPersons = Person.loadRecords();
		
		//the following example Displays Old age person
		System.out.println("Displays Old age person");
		listPersons.stream()
		    .sorted()
		    .map(p -> p.getAge())
		    .skip(listPersons.size() - 1)
		    .forEach(System.out::println);
		
		
		//the following example Displays young age person
		System.out.println("Displays young age person");
		listPersons.stream()
			.sorted((p1, p2) -> p2.getAge() - p1.getAge())
		    .map(p -> p.getAge())
		    .skip(listPersons.size() - 1)
		    .forEach(System.out::println);
	
	}
}
