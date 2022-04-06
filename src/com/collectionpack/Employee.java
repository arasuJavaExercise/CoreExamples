package com.collectionpack;

import java.util.Date;

public class Employee {
	String firstName;
	String lastName;
	Date joinDate;

	public Employee(String firstName, String lastName, Date joinDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
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

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			if (this.getFirstName().equals(emp.getFirstName()) && this.getLastName().equals(emp.getLastName()))
				return true;
		}

		return false;

	}
	
	public String toString() {
		return firstName + " " + lastName+ " " +joinDate;
	}
	// getters and setters
}
