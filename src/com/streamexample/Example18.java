package com.streamexample;

import java.util.List;
import java.util.function.Predicate;

/**
 * Program to count total number of MALE and FEMALE Persons
 *
 */
public class Example18 {
	public static void main(String[] args) {

		List<Person> personList = Person.loadRecords();

		Predicate<Person> malePerson = t -> t.getGender().equals(Gender.MALE);
		Predicate<Person> femalePerson = t -> t.getGender().equals(Gender.FEMALE);

		System.out.println("Total Number Of Male Persons are: " + personList.stream().filter(malePerson).count());
		System.out.println("Total Number Of Female Persons are: " + personList.stream().filter(femalePerson).count());

	}
}
