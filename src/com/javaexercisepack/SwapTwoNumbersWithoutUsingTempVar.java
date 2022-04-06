package com.javaexercisepack;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingTempVar {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number");
		int num2 = scan.nextInt();

		System.out.println("Before Swapping (num1 = " + num1 + " & num2 = " + num2 + ")");
		SwapTechnique1(num1, num2);

		SwapTechnique2(num1, num2);

	}

	private static void SwapTechnique1(int num1, int num2) {

		// using operators + , -
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swapping using + and - operators (num1 = " + num1 + " & num2 = " + num2 + ")");
	}

	private static void SwapTechnique2(int num1, int num2) {
		
		// using bitwise operator ^
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;

		System.out.println("After Swapping using ^ bitwise operators (num1 = " + num1 + " & num2 = " + num2 + ")");
	}

}
