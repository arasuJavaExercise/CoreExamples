package com.datastructurepack.binarysearch;

public class BinarySearchDemo {
	public static void main(String[] args) {

		BinarySearch binSearch = new BinarySearch(10);
		binSearch.insertElement(10);
		binSearch.insertElement(25);
		binSearch.insertElement(31);
		binSearch.insertElement(43);
		binSearch.insertElement(53);
		binSearch.insertElement(61);
		binSearch.insertElement(73);
		binSearch.insertElement(86);
		binSearch.insertElement(90);
		binSearch.insertElement(95);
		
		binSearch.display();
		
		binSearch.search(45);
		binSearch.search(73);

	}
}
