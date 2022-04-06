package com.javaexercisepack;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int first = scan.nextInt();
		System.out.println("Enter Second Number");
		int sec = scan.nextInt();
		System.out.println("Enter Third Number");
		int third = scan.nextInt();

		int largestNum = third > (first < sec ? first : sec) ? third : (first > sec ? first : sec);

		System.out.println("Largest of (" + first + "," + sec + "," + third + ") is " + largestNum);

	}

}
