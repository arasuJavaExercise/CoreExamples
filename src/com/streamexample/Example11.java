package com.streamexample;

import java.util.List;
import java.util.function.Predicate;

/**
 * programs examples of aggregate terminal allMatch operation
 */
public class Example11 {

	public static void main(String[] args) {
		List<Person> listPersons = Person.loadRecords();

		Predicate<Person> isAllPersonMale = item -> item.getGender().equals(Gender.MALE);
		// Check all persons are male persons
		System.out.println("Do all th persons are male? " + listPersons.stream().allMatch(isAllPersonMale));

		Predicate<Person> isAllPersonHaveEmail = item -> item.getEmail().endsWith("gmail.com");
		// Check whether all persons have gmail account
		System.out.println(
				"Do all the persons have gmail account? " + listPersons.stream().allMatch(isAllPersonHaveEmail));

	}
}
