package com.designpatterns.creationalpattern.factory;

public class VehicleFactory {
	public static Vehicle getInstance(String name, int wheel) {

		Vehicle vehicle = null;

		if (name.equals("Car")) {
			vehicle = new Car(wheel);
		}
		if (name.equals("Bike")) {
			vehicle = new Bike(wheel);
		}

		return vehicle;

	}
}
