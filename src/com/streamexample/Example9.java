package com.streamexample;

import java.util.List;

/**
 * programs examples of aggregate intermediate limit operation
 */
public class Example9 {

	public static void main(String[] args) {
			
		List<Person> listPersons = Person.loadRecords();
		
		//  the following example shows top 5 youngest persons
		System.out.println("Displays top 5 youngest persons");

		listPersons.stream()
	    .sorted()
	    .limit(5)
	    .forEach(System.out::println);
	}

}
