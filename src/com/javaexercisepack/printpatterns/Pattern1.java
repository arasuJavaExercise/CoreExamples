package com.javaexercisepack.printpatterns;

public class Pattern1 {
	public static void main(String[] args) {

		System.out.println("Pattern 1");
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");

			System.out.println("");
		}

		System.out.println("\nPattern 2");
		for (int m = 1; m <= 6; m++) {
			int n = 1;
			while (n <= (6 - m)) {
				System.out.print(" ");
				n++;
			}

			while (n <= 6) {
				System.out.print("*");
				n++;
			}

			System.out.println("");
		}

	}
}
