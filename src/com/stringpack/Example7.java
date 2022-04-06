package com.stringpack;



/**
 * Program to check whether the given string is palindrome or not
 *
 */
public class Example7 {

	public static void main(String[] args) {
		checkForPalindrome("ArasuKumar");
		checkForPalindrome("malayalam");
		checkForPalindrome("redivider");
		
	}

	
	private static void checkForPalindrome(String string) {
		
		String temp = "";
		char[] ch = string.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			temp+=ch[i];
		}
		
		if(temp.equals(string))
			System.out.println(string+" is Palindrome!!!");
		else
			System.out.println(string+" is not Palindrome!!!");
	}

}
