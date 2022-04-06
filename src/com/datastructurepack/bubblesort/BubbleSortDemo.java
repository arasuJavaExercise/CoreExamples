package com.datastructurepack.bubblesort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[] = { 32, 53, 5, 11, 76, 2, 22, 13, 43, 65, 27 };
		System.out.println("Before Sorting");
		Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
		bubbleSort(arr);
		System.out.println("\nAfter Sorting");
		Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
