package com.streamexample;

import java.util.ArrayList;
import java.util.List;

/**
 * program to get the average from the student score list
 *
 */
public class Example2 {

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

		double score = listStudents.stream().mapToInt(t -> t.getScore()).average().getAsDouble();
		System.out.println("Average scored : " + score);

	}

}
