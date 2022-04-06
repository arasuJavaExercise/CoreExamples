package com.designpatterns.creationalpattern.prototype.withclone;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) {

		List<String> vehicleList = new ArrayList<>();
		vehicleList.add("Maruthi");
		vehicleList.add("Santro");
		vehicleList.add("Skoda");
		vehicleList.add("BMW");
		vehicleList.add("Jaguar");

		VehicleManufacure manufacture = new VehicleManufacure(vehicleList);
		VehicleManufacure clonedManufacture = null;
		try {
			clonedManufacture = (VehicleManufacure) manufacture.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Before Updating");
		manufacture.displayVehicle();
		clonedManufacture.displayVehicle();
		clonedManufacture.getVehicles().set(1, "Santro XL");

		System.out.println("After Updating");
		manufacture.displayVehicle();
		clonedManufacture.displayVehicle();

	}

}
