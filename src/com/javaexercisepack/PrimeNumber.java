package com.javaexercisepack;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 6, res = num % 2;
		if (res == 0)
			System.out.println(num + " is not prime number");
		else
			System.out.println(num + " is prime number");

		System.out.println("Prime numbers from 1 to 25");

		int i = 3, count = 25;
		System.out.print("1 2");
		while (i < count) {
			if (i % 2 != 0)
				System.out.print(" " + i);
			i++;
		}

	}

}
