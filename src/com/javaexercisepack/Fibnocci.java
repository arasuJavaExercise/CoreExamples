package com.javaexercisepack;

public class Fibnocci {
	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3 = 0, count = 2;
		System.out.println("Fibnocci Series for 10 digits without recursion");
		System.out.print(n1 + " " + n2);

		while (count < 10) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			count++;

		}
		count = 2;
		n1 = 0;
		n2 = 1;
		System.out.println("\nFibnocci Series for 10 digits with recursion");
		System.out.print(n1 + " " + n2);
		
		fibnocciSeries(n1, n2, count);
	}

	private static void fibnocciSeries(int n1, int n2, int count) {

		if (count < 10) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			count++;
			fibnocciSeries(n1, n2, count);
		}

	}
}
