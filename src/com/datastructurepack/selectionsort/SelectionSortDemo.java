package com.datastructurepack.selectionsort;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {

		int arr[] = { 32, 53, 5, 11, 76, 2, 22 };
		System.out.println("Before Sorting");
		Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
		selectionSort(arr);
		System.out.println("\nAfter Sorting");
		Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			int imin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[imin]) {
					imin = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[imin];
			arr[imin] = temp;
		}
	}

}
