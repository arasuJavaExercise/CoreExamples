package com.designpatterns.creationalpattern.prototype.withoutclone;

public class Address {
	private String area;
	private String city;
	private String state;
	private String country;

	private Address(AddressBuilder builder) {
		this.area = builder.area;
		this.city = builder.city;
		this.state = builder.state;
		this.country = builder.country;
	}

	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public static class AddressBuilder {
		private String area;
		private String city;
		private String state;
		private String country;

		public AddressBuilder(String state, String country) {
			this.state = state;
			this.country = country;
		}

		public AddressBuilder setArea(String area) {
			this.area = area;
			return this;
		}

		public AddressBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public Address build() {
			return new Address(this);
		}
	}

	@Override
	public String toString() {
		return "ADDRESS: [" + this.getCountry() + ", " + this.getState() + ", " + this.getCity() + ", " + this.getArea()
		+ "]";
	}
}
