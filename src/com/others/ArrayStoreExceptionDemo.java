package com.others;

public class ArrayStoreExceptionDemo {

	public static void main(String[] args) {
		Object arr[] = new String[2];
		arr[0] = "String 1";
		arr[1] = 1; // ArrayStoreException will be thrown
	}

}
