package com.streamexample;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Program to fetch top 3 students whose scores are greater than or equal to 70
 * in descending order.
 *
 */

public class Example4 {

	public static void main(String[] args) {

		List<Student> listStudents = new ArrayList<>();

		listStudents.add(new Student("Alice", 82));
		listStudents.add(new Student("Bob", 90));
		listStudents.add(new Student("Carol", 67));
		listStudents.add(new Student("David", 80));
		listStudents.add(new Student("Eric", 55));
		listStudents.add(new Student("Frank", 49));
		listStudents.add(new Student("Gary", 88));
		listStudents.add(new Student("Henry", 98));
		listStudents.add(new Student("Ivan", 66));
		listStudents.add(new Student("John", 52));

		Predicate<Student> predicate = t -> t.getScore() > 70;
		List<Student> top3Students = listStudents.stream().filter(predicate)
				.sorted().limit(3).collect(Collectors.toList());

		Consumer<Student> consume = t -> System.out.println(t);
		System.out.println("Top 3 Students by Score:");
		top3Students.forEach(consume);

	}

}
