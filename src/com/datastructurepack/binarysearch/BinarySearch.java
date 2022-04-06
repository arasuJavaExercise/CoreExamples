package com.datastructurepack.binarysearch;

import java.util.Arrays;

public class BinarySearch {
	int storage[], index, size;

	public BinarySearch(int size) {
		this.size = size;
		this.storage = new int[size];
		this.index = 0;
	}

	public void insertElement(int num) {
		if (index == size) {
			System.out.println("Space is Full!!!");
		}
		storage[index++] = num;
	}

	public void display() {
		Arrays.stream(storage).forEach(t -> System.out.print(t + " "));
		System.out.println("");
	}

	public void search(int element) {
		int pos = findElement(element, 0, index, storage);
		if (pos == -1)
			System.out.println(element + " Not Found");
		else
			System.out.println(element + " Found At Position " + pos);

		System.out.println("");
	}

	private int findElement(int element, int start, int end, int arr[]) {

		if (end >= start) {
			int mid = (start + end) / 2;

			if (storage[mid] == element)
				return mid;

			if (element > storage[mid])
				return findElement(element, mid + 1, end, arr);

			if (element < storage[mid])
				return findElement(element, start, mid - 1, arr);
		}

		return -1;
	}

}
