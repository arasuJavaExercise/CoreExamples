package com.designpatterns.creationalpattern.builder;

class Vehicle {
	// compulsory members
	private int wheel;
	private String engine;

	// optional members
	private boolean airBags;
	private boolean airBrake;
	private String color;
	private boolean airCooler;
	private boolean soundBuster;

	private Vehicle(VehicleBuilder builder) {
		this.wheel = builder.wheel;
		this.engine = builder.engine;
		this.airBags = builder.airBags;
		this.airBrake = builder.airBrake;
		this.color = builder.color;
		this.airCooler = builder.airCooler;
		this.soundBuster = builder.soundBuster;
	}

	public int getWheel() {
		return wheel;
	}

	public String getEngine() {
		return engine;
	}

	public boolean isAirBags() {
		return airBags;
	}

	public boolean isAirBrake() {
		return airBrake;
	}

	public String getColor() {
		return color;
	}

	public boolean isAirCooler() {
		return airCooler;
	}

	public boolean isSoundBuster() {
		return soundBuster;
	}

	public static class VehicleBuilder {
		private int wheel;
		private String engine;
		private boolean airBags;
		private boolean airBrake;
		private String color;
		private boolean airCooler;
		private boolean soundBuster;

		public VehicleBuilder(String engine, int wheel) {
			this.wheel = wheel;
			this.engine = engine;
		}

		public VehicleBuilder setWheel(int wheel) {
			this.wheel = wheel;
			return this;
		}

		public VehicleBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}

		public VehicleBuilder setAirBags(boolean airBags) {
			this.airBags = airBags;
			return this;
		}

		public VehicleBuilder setAirBrake(boolean airBrake) {
			this.airBrake = airBrake;
			return this;
		}

		public VehicleBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public VehicleBuilder setAirCooler(boolean airCooler) {
			this.airCooler = airCooler;
			return this;
		}

		public VehicleBuilder setSoundBuster(boolean soundBuster) {
			this.soundBuster = soundBuster;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}

}
