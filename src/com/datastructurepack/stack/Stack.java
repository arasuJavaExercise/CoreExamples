
package com.datastructurepack.stack;

public class Stack {
	int _storage[], _capacity, _top;

	public Stack() {
		_capacity = 10;
		_top = -1;
		_storage = new int[_capacity];
	}

	public void push(int num) {
		if (_top == (_capacity - 1))
			System.out.println("Stack Overflow: Stack is Full");
		else {
			_storage[++_top] = num;
		}
	}

	public int pop() {
		int _res = -1;

		if (_top == -1)
			System.out.println("Stack Underflow: Stack is Empty");
		else {
			_res = _storage[_top--];
		}
		return _res;
	}

	public void display() {
		if (_top == -1)
			System.out.println("Stack Underflow: Stack is Empty");
		else {

			for (int i = 0; i <= _top; i++) {
				System.out.print(_storage[i] + " ");
			}
		}

		System.out.println("");
	}

}
