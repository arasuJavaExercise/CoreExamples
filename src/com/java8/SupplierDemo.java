package com.java8;

import java.util.function.Supplier;
import java.util.*;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Integer> supplier = () -> {
			Random rand = new Random();
			return rand.nextInt(1000);
		};

		System.out.println(supplier.get());
	}
}
