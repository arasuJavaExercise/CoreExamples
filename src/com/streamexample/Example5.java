package com.streamexample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * programs examples of aggregate intermediate filter operation
 */
public class Example5 {


	public static void main(String[] args) {

		List<Person> listPersons = Person.loadRecords();
		Consumer<Person> display = t->System.out.println(t);
		
		// The following example lists only male persons:
		System.out.println("Display only male Persons");
		Predicate<Person> maleOnly = t->t.getGender().equals(Gender.MALE);
		listPersons.stream()
		.filter(maleOnly)
		.forEach(display);
		
		// The following example lists only female persons under 25:
		System.out.println("\nDisplay only Female Persons under 25");
		Predicate<Person> femaleOnly = t->t.getGender().equals(Gender.FEMALE) && t.getAge() < 25;
		listPersons.stream()
		.filter(femaleOnly)
		.forEach(display);

	}

}
