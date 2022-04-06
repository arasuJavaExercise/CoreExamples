package com.designpatterns.creationalpattern.prototype.withclone;

import java.util.ArrayList;
import java.util.List;

public class VehicleManufacure {
	List<String> vehicleList = null;

	public VehicleManufacure() {
		vehicleList = new ArrayList<>();
	}

	public VehicleManufacure(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<String> getVehicles() {
		return vehicleList;
	}

	public void displayVehicle() {
		System.out.println(vehicleList);
	}

	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// return new VehicleManufacure(vehicleList);
	// }

	@Override
	protected Object clone() throws CloneNotSupportedException {

		List<String> tempVehicleList = new ArrayList<>();
		for (String vehicle : vehicleList) {
			tempVehicleList.add(vehicle);
		}

		return new VehicleManufacure(tempVehicleList);
	}

}
