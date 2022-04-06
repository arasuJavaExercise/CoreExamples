package com.javaexercisepack;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int digits = 0, temp1 = num;

		while (temp1 > 0) {
			temp1 = temp1 / 10;
			digits++;
		}

		int temp2 = num, result = 0;

		while (temp2 > 0) {
			result += (Math.pow((temp2 % 10), digits));
			temp2 = temp2 / 10;
		}

		System.out.println(result);

	}

}
