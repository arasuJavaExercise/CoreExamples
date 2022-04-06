package com.designpatterns.creationalpattern.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("Car", 4);
		System.out.println(car);
		Vehicle bike = VehicleFactory.getInstance("Bike", 2);
		System.out.println(bike);
	}
}
