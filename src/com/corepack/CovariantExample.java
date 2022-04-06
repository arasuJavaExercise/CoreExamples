package com.corepack;

class One {
	One get() {
		return this;
	}
}

public class CovariantExample extends One {

	CovariantExample get() {
		return this;
	}

	void message() {
		System.out.println("After Java5 welcome to covariant return type");
	}

	public static void main(String[] args) {
		new CovariantExample().get().message();
	}

}
