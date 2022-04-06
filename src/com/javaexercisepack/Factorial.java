package com.javaexercisepack;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		System.out.println("Enter number to find its factorial");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = num;
		for (int i = num; i > 1; --i) {
			fact = fact * (i - 1);
		}

		System.out.println("Factorial of " + num + " is " + fact);

	}
}
