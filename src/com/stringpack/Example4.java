package com.stringpack;

/**
 * Program to remove white space from the string using build in method and
 * without build in method
 *
 */
public class Example4 {

	public static void main(String[] args) {

		String str = "Welcome To The World Of Java 8";
		
		System.out.println("1. Using Build in method replaceAll");
		System.out.println(str);
		String str1 = str.replaceAll("\\s+", "");
		System.out.println(str1);
		
		System.out.println("\n2. Without using the build in method replaceAll");
		String str2 = clearSpaceFromTheString(str);
		System.out.println(str2);

	}

	private static String clearSpaceFromTheString(String str) {
		
		String temp = "";
		String tempStr[] = str.split("\\s");
		
		for(String s : tempStr){
			if(!s.equals(" ") || !s.equals("\\t")){
				temp+=s;
			}
		}
		
		return temp;
	}

}
