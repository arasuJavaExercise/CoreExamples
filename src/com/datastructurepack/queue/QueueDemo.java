package com.datastructurepack.queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		System.out.println("Is queue is empty ? " + queue.isEmpty());
		queue.dequeue();
		queue.display();
		System.out.println("Is Now queue is empty ? " + queue.isEmpty());
	}
}
