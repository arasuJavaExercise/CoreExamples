package com.stringpack;

/**
 * Program to check whether the given first string has rotation of second string
 *
 */
public class Example8 {

	public static void main(String[] args) {

		String str1 = "BangaloreArasuKumarGowda";
		String str2 = "KumarGowdaBangaloreArasu";

		if (str1.length() != str2.length()) {
			System.out.println("Second String is not the rotation of the first String");
		} else {

			String str3 = str1 + str2;
			if (str3.contains(str2))
				System.out.println("Second String is the rotation of the first String");
			else
				System.out.println("Second String is not the rotation of the first String");

		}
	}
}
