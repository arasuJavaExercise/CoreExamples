package com.stringpack;

/**
 * Program to find the total occurance of selected word/character in the given string
 */

public class Example2 {

	public static void main(String[] args) {

		String str = "aaabbbddbcccbaabshhhsfasasndhfbhjsbdf";
		String c = "ba";
		int strlLen = str.length();

		int selChrOccurance = strlLen - str.replace(c, "").length();
		System.out.println("Total occurance of '" + c + "' in the given string is : " + selChrOccurance);

	}

}
