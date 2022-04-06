package com.corepack;

public class StringDemo {

	public static void main(String[] args) {
		
//		String str1 = "Arasu";
//		String str2 = "Arasu";
//		String str3 = new String("Arasu");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str3 == str1);
//		System.out.println(str3.equals(str2));
		
		
		String s1="welcome to split world";  
		
		String str1[] = s1.split("\\s", 5);
		for(String s: str1){
			System.out.println(s);
		}
	}

}
