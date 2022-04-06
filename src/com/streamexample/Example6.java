package com.streamexample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * programs examples of aggregate intermediate map operation
 */
public class Example6 {

	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();
		Consumer<Integer> display = t -> System.out.print(t+" - ");
		
		// the following example maps email address of female person
		System.out.println("Display Only Female Email Address");
		Predicate<Person> female = t->t.getGender().equals(Gender.FEMALE);
		Function<Person, String> function1 = t -> t.getEmail();
		listPersons.stream()
		.filter(female)
		.map(function1)
		//.map(t -> t.getEmail())
		.forEach(System.out::println);
		
		// the following example maps age address of female person
		System.out.println("\nDisplay only Female age");
		Function<Person, Integer> function2 = t -> t.getAge();
		listPersons.stream()
		.filter(female)
		.map(function2)
		//.map(t -> t.getAge())
		.forEach(display);
		System.out.println("");
		
		// the following example maps first name of all person in uppercase
		System.out.println("\nDisplay maps first name of all person in uppercase");
		Function<Person, String> function3 = t -> t.getFirstName().toUpperCase();
		
		listPersons.stream()
		.filter(female)
		//.map(t -> t.getFirstName().toUpperCase())
		.map(function3)
		.forEach(System.out::println);

		
	}
}
