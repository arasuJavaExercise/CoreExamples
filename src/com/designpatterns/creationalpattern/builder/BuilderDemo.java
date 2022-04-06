package com.designpatterns.creationalpattern.builder;

import com.designpatterns.creationalpattern.builder.Vehicle.VehicleBuilder;

public class BuilderDemo {

	public static void main(String[] args) {
		Vehicle bike = new VehicleBuilder("200CC", 2).setAirBrake(true).setColor("Light Grey").build();
		System.out.println("BIKE : " + bike.getColor() + ", " + bike.getEngine() + ", " + bike.getWheel()
		+ ", AIRBRAKE " + bike.isAirBrake());

	}

}
