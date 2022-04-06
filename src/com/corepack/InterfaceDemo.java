package com.corepack;

interface MyInterface1 {
	default public void display() {
		System.out.println(" Calling MyInterface1 display method");
	}
}

interface MyInterface2 {
	default public void display() {
		System.out.println(" Calling MyInterface2 display method");
	}
}

class MyImplementationClass implements MyInterface1, MyInterface2 {
	public void display() {
		MyInterface1.super.display();
		MyInterface2.super.display();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		new MyImplementationClass().display();
	}
}
