package com.streamexample;

import java.util.List;
import java.util.function.Predicate;

/**
 * programs examples of aggregate terminal anyMatch and noneMatch operation
 */
public class Example12 {
	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();

		// check whether is there a female person
		Predicate<Person> isAnyFemalePersonExists = item -> item.getGender().equals(Gender.FEMALE);
		System.out.println("is there a female person? " + listPersons.stream().anyMatch(isAnyFemalePersonExists));

		// check whether teenagers exists in person list
		Predicate<Person> doTeenagersExists = item -> item.getAge() < 25;
		System.out.println("is teenagers exists in person list? " + listPersons.stream().anyMatch(doTeenagersExists));

		// do any person uses yahoo mail
		boolean noYahooMail = listPersons.stream().noneMatch(p -> p.getEmail().endsWith("yahoo.com"));
	 	System.out.println("No one uses Yahoo mail? " + noYahooMail);
		
		
	}
}
