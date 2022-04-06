package com.designpatterns.creationalpattern.prototype.withoutclone;

import com.designpatterns.creationalpattern.prototype.withoutclone.Address.AddressBuilder;

public class ProtoypeDemo {
	public static void main(String[] args) {

		Person person = new Person("Arasu",
				new AddressBuilder("India", "Karnataka")
				.setArea("Vidyaranyapura")
				.setCity("Bengaluru")
				.build());
		
		System.out.println("Before Change");
		System.out.println(person);
		Person clonePerson = person.dClone();
		System.out.println(clonePerson);
		
		System.out.println("After Change");
		clonePerson.getAddress().setCity("Mysore");
		System.out.println(person);
		System.out.println(clonePerson);
		
	}
}
