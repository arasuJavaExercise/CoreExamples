package com.javaexercisepack;

import java.util.Scanner;

/**
 * GCD / GCF / HCF Greatest Common Factor or Greatest Common Divisor or Highest
 * Common Factor
 *
 */
public class GCF {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("GCD\n You need to enter two numbers to find the GCD of it");
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();

		System.out.println("Enter the Second number");
		int num2 = scan.nextInt();

		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		System.out.println("GCD of (" + num1 + "," + num2 + ") = " + gcd);

	}
}
