package com.designpatterns.creationalpattern.factory;

public abstract class Vehicle {
	public abstract int getWheel();
	
	@Override
	public String toString() {
		return "Wheel is "+this.getWheel();
	}
}
