package com.datastructurepack.mergesort;

import java.util.Scanner;

public class MergeSortDemo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Merge Sort Technique\nPlease Enter Size Of Array You Want?");

		int size = scan.nextInt();

		MergeSort mergeSort = new MergeSort(size);
		for (int i = 1; i <= size; i++) {
			mergeSort.insert(scan.nextInt());
		}
		System.out.println("\nPlease wait.....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nBefore Sorting");
		mergeSort.display();

		mergeSort.sort();

		System.out.println("\nAfter Sorting");
		mergeSort.display();

	}
}
