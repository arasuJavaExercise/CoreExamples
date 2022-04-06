package com.datastructurepack.quicksort;

import java.util.Arrays;

public class QuickSort {
	int storage[], size, index;

	public QuickSort(int size) {
		this.size = size;
		this.index = 0;
		this.storage = new int[size];
	}

	public void insert(int num) {
		if (index == size)
			System.out.println("Out Of Space!!!");
		else {
			storage[index++] = num;
		}
	}

	public void display() {
		Arrays.stream(storage).forEach(t -> System.out.print(t + " "));
		System.out.println("");
	}

	public void sort() {
		quickSort(storage, 0, storage.length - 1);
	}

	private void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = getPartition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}

	private int getPartition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end - 1; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}

		int temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;

		return pIndex;
	}
}
