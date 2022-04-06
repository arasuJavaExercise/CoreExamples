package com.javaexercisepack;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check its palindrome");
		int num = scan.nextInt(), temp = num;
		int rem = 0, rev = 0;

		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println(rev + " is a palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}

		System.out.println("Enter the number to check its palindrome in another way");
		String number = scan.next();
		char ch[] = number.toCharArray();
		String temp1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			temp1 = temp1 + ch[i];
		}

		if (number.equals(temp1)) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}

}
