package com.datastructurepack.queue;

public class Queue {
	int storage[], capacity, rear, front;

	public Queue() {
		capacity = 5;
		rear = -1;
		front = -1;
		storage = new int[capacity];

	}

	public boolean isEmpty() {
		if (rear == -1 && front == -1)
			return true;
		else
			return false;
	}

	public void enqueue(int num) {
		if (isEmpty())
			rear = front = 0;
		else {
			rear = rear + 1;
		}
		storage[rear] = num;
	}

	public int dequeue() {
		int res = -1;
		if (front == rear) {
			front = rear = -1;
			System.out.println("No Record Found!!!");
		} else {
			res = storage[front++];
		}

		return res;
	}

	public void display() {
		if (rear == -1 && front == -1)
			System.out.println("Queue Is Empty!!!");
		else {
			for (int i = rear; i >= front; i--) {
				System.out.print(storage[i] + " ");
			}
		}
		
		System.out.println("");
	}
}
