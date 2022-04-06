package com.streamexample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Program convert from list into Set and Convert from List into Map
 *
 */
public class Example19 {

	public static void main(String[] args) {

		List<Person> personList = Person.loadRecords();

		// Convert the list into Set Collection
		Set<Person> personSet = personList.stream().collect(Collectors.toSet());
		personSet.stream().forEach(System.out::println);

		Function<Person, String> funEmail = t -> t.getEmail();
		Function<Person, String> funFirstLastName = t -> t.getFirstName() + " , " + t.getLastName();
		// Convert the list into Map
		Map<String, String> personMap = personList.stream().collect(Collectors.toMap(funEmail, funFirstLastName));
		System.out.println(personMap);

	}

}
