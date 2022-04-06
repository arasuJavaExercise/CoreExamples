package com.datastructurepack.linkedlist;

public class SinglyListDemo {
	public static void main(String[] args) {
		
		SinglyList sList = new SinglyList();
		sList.insertNode(10);
		sList.insertNode(20);
		sList.insertNode(30);
		sList.insertNode(40);
		sList.displayList();
		
		sList.insertAtBegining(50);
		sList.displayList();
		
	}
}
