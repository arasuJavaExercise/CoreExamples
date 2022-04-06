package com.designpatterns.creationalpattern.factory;

public class Car extends Vehicle {
	private int wheel;

	public Car(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return this.wheel;
	}
}
