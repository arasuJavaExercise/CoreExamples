package com.designpatterns.creationalpattern.factory;

public class Bike extends Vehicle {
	private int wheel;

	public Bike(int wheel) {
		this.wheel = wheel;
	}

	public int getWheel() {
		return this.wheel;
	}
}