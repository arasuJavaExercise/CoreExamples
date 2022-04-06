package com.datastructurepack.mergesort;

import java.util.Arrays;

public class MergeSort {

	int storage[], size, index;

	public MergeSort(int size) {
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
		divideAndMerge(storage);
	}

	private void divideAndMerge(int[] storage) {

		int len = storage.length;

		if (len < 2) 
			return;
		
		int mid = len / 2;

		int left[] = new int[mid];
		int right[] = new int[len - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = storage[i];
		}

		for (int j = mid; j < len; j++) {
			right[j - mid] = storage[j];
		}

		divideAndMerge(left);
		divideAndMerge(right);
		sortAndMerge(left, right, storage);

	}

	private void sortAndMerge(int[] left, int[] right, int[] storage) {

		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;

		while (i < nL && j < nR) {
			if (left[i] < right[j]) {
				storage[k++] = left[i++];
			} else {
				storage[k++] = right[j++];
			}
		}

		while (i < nL) {
			storage[k++] = left[i++];
		}

		while (j < nR) {
			storage[k++] = right[j++];
		}
	}

}
