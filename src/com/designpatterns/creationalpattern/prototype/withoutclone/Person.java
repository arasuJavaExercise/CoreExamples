package com.designpatterns.creationalpattern.prototype.withoutclone;

import com.designpatterns.creationalpattern.prototype.withoutclone.Address.AddressBuilder;

public class Person {
	private String name;
	private Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public Person dClone() {
		Address address = new AddressBuilder(this.address.getState(), this.address.getCountry())
				.setArea(this.address.getArea()).setCity(this.address.getCity()).build();
		return new Person(this.name, address);
	}

	@Override
	public String toString() {
		return "NAME: "+ this.name + ", " + this.address;
	}

}
