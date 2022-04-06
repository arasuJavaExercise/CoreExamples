package com.stringpack;

/**
 * Program to reverse the string in java
 *
 */
public class Example5 {

	public static void main(String[] args) {

		String str = "ArasuKumarGowda";
		char[] ch = str.toCharArray();

		String temp = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			temp += ch[i];
		}

		System.out.println("String Before Reverse");
		System.out.println(str);
		System.out.println("String After Reverse");
		System.out.println(temp);

	}

}
