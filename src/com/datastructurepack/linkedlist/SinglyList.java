package com.datastructurepack.linkedlist;

public class SinglyList {
	Node head;

	public void insertNode(int element) {
		if (head == null) {
			head = new Node(element);
		} else {
			Node node = new Node(element);
			Node currentNode = head;
			while(currentNode.next != null){
				currentNode = currentNode.next;
				
			}
			
			currentNode.next = node;
		}
	}
	
	public void insertAtBegining(int num){
		
		if(head == null)
			head = new Node(num);
		else{
			Node node = new Node(num);
			node.next = head;
			head = node;
		}
	}

	public void displayList() {
		if (head == null)
			System.out.println("List is Empty!!!");
		else {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
		
		System.out.println("");
	}

}
