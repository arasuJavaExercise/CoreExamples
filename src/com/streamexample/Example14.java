package com.streamexample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

/**
 * programs examples of aggregate terminal min & max operation
 *
 */
public class Example14 {

	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();

		// program to display young female from the Person list
		Predicate<Person> femaleList = t -> t.getGender().equals(Gender.FEMALE);
		Comparator<Person> youngAgeList = (t1, t2) -> t1.getAge() - t2.getAge();
		Optional<Person> personList = listPersons.stream().filter(femaleList).min(youngAgeList);
		if (personList.isPresent()) {
			Person person = personList.get();
			System.out.println(person.getFirstName() + " is young teenage female in list and her age is ("
					+ person.getAge() + ")");
		}

		// program to display old female from the person list
		Comparator<Person> oldAgeList = (t1, t2) -> t1.getAge() - t2.getAge();
		Optional<Person> persnList = listPersons.stream().filter(femaleList).max(oldAgeList);
		if (persnList.isPresent()) {
			Person person = persnList.get();
			System.out
			.println(person.getFirstName() + " is old female in list and her age is (" + person.getAge() + ")");
		}
	}

}
