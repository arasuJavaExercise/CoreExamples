package com.javaexercisepack;

/**
 * Program to swap two number without using the third temporary variable
 *
 */
public class Example2 {

	public static void main(String[] args) {

		//Using addition and subtraction
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping X = " + x + " and Y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping X = " + x + " and Y = " + y);

		// Using multiplication and division
		int a = 30;
		int b = 40;
		System.out.println("Before Swapping A = " + a + " and B = " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swapping A = " + a + " and B = " + b);
		
		// Using Bitwise XOR
		int m = 100;
		int n = 200;
		System.out.println("Before Swapping M = " + m + " and N = " + n);
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println("After Swapping M = " + m + " and N = " + n);

	}
}
