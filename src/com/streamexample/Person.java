package com.streamexample;

import java.util.*;

enum Gender {
	MALE, FEMALE
}

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private int age;

	public Person() {
	}

	public Person(String firstName, String lastName, String email, Gender gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Person another) {
		return this.age - another.getAge();
	}

	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.age;
	}

	public static List<Person> loadRecords() {

		List<Person> listPersons = new ArrayList<>();

		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));

		return listPersons;

	}

}