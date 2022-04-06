package com.stringpack;

/**
 * Program to Reverse The String With Preserving The Position Of Spaces
 *
 */
public class Example9 {

	public static void main(String[] args) {
		String str = "I am an indian";

		char[] orgChar = str.toCharArray();
		char[] presvChar = new char[orgChar.length];

		// preserve maintained in temporary char array
		for (int i = 0; i < orgChar.length; i++) {
			if (orgChar[i] == ' ') {
				presvChar[i] = ' ';
			}
		}

		int j = presvChar.length - 1;
		for (int k = 0; k < orgChar.length; k++) {

			if (orgChar[k] != ' ') {
				if (presvChar[j] == ' ') {
					j--;
				}

				presvChar[j] = orgChar[k];
				j--;
			}
		}
		System.out.println(str);
		System.out.println(String.valueOf(presvChar));
		
	}
}
