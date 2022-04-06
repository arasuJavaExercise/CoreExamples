package com.java8;

import java.util.*;
import java.util.stream.*;

interface ProductCalc {
	public double calculate();

}

public class LambaDemo {

	public static void main(String[] args) {

		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(1, "Sony", 26000));
		prodList.add(new Product(5, "Philps", 43000));
		prodList.add(new Product(3, "LG", 67000));
		prodList.add(new Product(2, "HP", 55000));

		Stream<Product> prodStream = prodList.stream().filter(p -> p.getPrice() > 40000);
		prodStream.forEach(n -> System.out.println(n));


	}

}
