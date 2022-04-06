package com.collectionpack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class EmployeeComparator implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getJoinDate().compareTo(emp2.getJoinDate());
	}
}

public class ComparatorDemo {
	public static void main(String[] args) throws ParseException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Set<Employee> setEmployees = new TreeSet<>(new EmployeeComparator());
		
		// Employee1 = Employee3 and Employee2 = Employee5 
		Employee employee1 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03")); // employee3
		Employee employee2 = new Employee("Tom", "Smith", dateFormat.parse("2005-06-20")); // employee5
		Employee employee3 = new Employee("Bill", "Joy", dateFormat.parse("2007-12-03"));
		Employee employee4 = new Employee("Bill", "Gates", dateFormat.parse("2005-05-12"));
		Employee employee5 = new Employee("Alice", "Wooden", dateFormat.parse("2005-06-20"));
		setEmployees.add(employee1);
		setEmployees.add(employee2);
		setEmployees.add(employee3);
		setEmployees.add(employee4);
		setEmployees.add(employee5);
		System.out.println(setEmployees);
		
	}
}
