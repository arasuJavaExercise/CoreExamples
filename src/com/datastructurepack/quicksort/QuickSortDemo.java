package com.datastructurepack.quicksort;

import java.util.Scanner;

public class QuickSortDemo {

	public static void main(String[] args) {

		System.out.println("Please enter how many number of elements do you want in array ?");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		QuickSort qSort = new QuickSort(size);
		System.out.println("Now enter each element");
		for (int i = 0; i < size; i++) {
			qSort.insert(scan.nextInt());
		}
		System.out.println("Before Sorting");
		qSort.display();
		qSort.sort();
		System.out.println("After Sorting");
		qSort.display();
		
	}

}
