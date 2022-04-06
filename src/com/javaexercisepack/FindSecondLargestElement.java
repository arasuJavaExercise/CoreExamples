package com.javaexercisepack;

public class FindSecondLargestElement {

	public static void main(String[] args) {

		Integer[] arr = { 32, 6, 11, 5, 87, 2 };
		System.out.println("Second Largest Number is : " + find(arr));

	}
	// [32, 6, 11, 5, 87, 2]
	public static Integer find(Integer arr[]) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}

			if (arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

}
