package com.datastructurepack.stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Display Stack");
		stack.display();
		
		System.out.println("Element "+ stack.pop() +" Popout from Stack");
		System.out.println("Element "+ stack.pop() +" Popout from Stack");
		stack.display();
		
		
	}
}
