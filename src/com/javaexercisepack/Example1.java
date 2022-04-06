package com.javaexercisepack;

/**
 * Program to reverse the given number
 *
 */
public class Example1 {

	public static void main(String[] args) {

		System.out.println("Reverse of 3465 is " + reverseNumber(3465));
		System.out.println("Reverse of 45565 is " + reverseNumber(45565));
		System.out.println("Reverse of 87 is " + reverseNumber(87));
		System.out.println("Reverse of 8765432 is " + reverseNumber(8765432));

	}

	private static int reverseNumber(int num) {

		int reverse = 0, rem = 0;

		while (num != 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}

		return reverse;
	}

}
