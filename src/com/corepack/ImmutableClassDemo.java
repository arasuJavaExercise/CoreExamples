package com.corepack;


final class Employee{
	
	final String panCard;
	/**
	 * @param panCard
	 */
	Employee(String panCard){
		this.panCard = panCard;
	}
	public String getPanCard() {
		return panCard;
	}
	
}


public class ImmutableClassDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Employee emp = new Employee("Arasu");
		//System.out.println(emp.getPanCard());
		
/*		String strPassword=new String("Unknown");
		char[] charPassword= new char[]{'U','n','k','w','o','n'};
		System.out.println("String password: " + strPassword);
		System.out.println("Character password: " + charPassword);
		
		 
		String str = "ArasuKumarGowda";
		char[] ch = str.toCharArray();
		
		System.out.println(ch);
		
		
		int num = 10;
		String ss = String.valueOf(num);
		ss = Integer.toString(num);*/
		
		
		String s1 = "Sachin";
		String s2 = new String("SachinTendulkar");
		
		System.out.println((s1 == s2));
		
		//s2 = s1.intern();
		//System.out.println((s1 == s2));
		
		
		s1 = s1.replace('S', 'A');
		System.out.println(s1);
		
		s2 = s2.replaceAll("a", "4");
		System.out.println(s2);
	}

}
