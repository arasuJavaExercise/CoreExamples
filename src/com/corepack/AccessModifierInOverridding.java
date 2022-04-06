package com.corepack;

class Parent1 implements Cloneable{
	
	protected void show(){
		System.out.println("This is Parent1 show");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Child1 extends Parent1{
	public void show(){
		System.out.println("This is Child1 show");
	}
}


public class AccessModifierInOverridding {

	public static void main(String[] args) {

	}

}
