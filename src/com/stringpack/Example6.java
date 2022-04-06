package com.stringpack;

/**
 * Program to reverse each word from the string
 *
 */
public class Example6 {

	public static void main(String[] args) {
		reverseTheString("This is simple java string exercise");
	}

	private static void reverseTheString(String string) {

		System.out.println("String Before Reverse: \t" + string);
		String str = "";
		for (String s : string.split("\\s")) {
			str += getReversedString(s) + " ";
		}
		System.out.println("Stirng After Reverse: \t" + str.trim());

	}

	private static String getReversedString(String s) {

		char[] ch = s.toCharArray();

		String temp = "";
		for (int i = ch.length - 1; i >= 0; i--)
			temp += ch[i];

		return temp;
	}
}
