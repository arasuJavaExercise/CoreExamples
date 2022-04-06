package com.corepack;

interface IntTest {

	public int num1 = 10;
	
	public void show();

	default void display() {

	}

	static void disp() {

	}

}

class IntImpl implements IntTest{

	@Override
	public void show() {
		
	}
	
}

abstract class Test {
	int num1, num2;

	Test() {
	}

	Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	final public void show() {
	}

	static public void show1() {
	}

	public void show2() {
	}

	public abstract void show3();
}

class Test1 extends Test {

	Test1(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public void show3() {

	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {

		new IntImpl().display();
		
		
	}

}
