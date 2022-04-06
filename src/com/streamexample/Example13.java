package com.streamexample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * programs examples of aggregate terminal collect, forEach & count operation
 *
 */
public class Example13 {

	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();
		
		// Program to count number of female persons in list
		Predicate<Person> femalePerson = item -> item.getGender().equals(Gender.FEMALE);
		long femaleCount = listPersons.stream().filter(femalePerson).count();
		System.out.println("1. No. of Female count: "+femaleCount);
		
		// program fetches the list of person email
		System.out.println("\n2. Display Person email list");
		Function<Person, String> emailMapper = item -> item.getEmail();
		Consumer<String> showEmail = item -> System.out.println(item);
		List<String> emailList = listPersons.stream().map(emailMapper).collect(Collectors.toList());
		emailList.forEach(showEmail);

		// program displays the person firstname list in ascending order
		System.out.println("\n3. Display Person firstname in ascending order");
		Function<Person, String> firstNameMapper = item -> item.getFirstName();
		Consumer<String> showFirstName = item -> System.out.println(item);
		// listPersons.stream().map(t->t.getFirstName()).collect(Collectors.toCollection(TreeSet::new));
		Set<String> firstNameList = listPersons.stream().map(firstNameMapper)
				.collect(Collectors.toCollection(TreeSet::new));
		firstNameList.forEach(showFirstName);

		// program to group persons based on their gender
		System.out.println("\n4. Group Person based ont heir gender");
		Function<Person, Gender> gender = item -> item.getGender();
		Map<Gender, List<Person>> genderGrpList = listPersons.stream().collect(Collectors.groupingBy(gender));
		System.out.println(genderGrpList);

		// program to concatenate comma(,) in firstname list
		System.out.println("\n5. Concatenate comma(,) in firstname list");
		String fNameList = listPersons.stream().map(t -> t.getFirstName()).collect(Collectors.joining(","));
		System.out.println(fNameList);
	}

}
