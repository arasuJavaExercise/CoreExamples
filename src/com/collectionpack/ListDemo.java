package com.collectionpack;

import java.util.*;

class Parent {
	private String id;

	public Parent(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return this.id+"";
	}
}

class Child extends Parent {

	public Child(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return "" + super.getId();
	}
}

public class ListDemo {

	public static void main(String[] args) {

		List<Parent> newList = new ArrayList<>();
		newList.add(new Child("Child1"));
		newList.add(new Child("Child2"));
		newList.add(new Child("Child3"));
		newList.add(new Child("Child4"));
		newList.add(new Child("Child5"));


		Parent[] parArr = newList.toArray(new Parent[newList.size()]);
		
		
		
		//		
		//		
		//		
		//		List<String> strList = new ArrayList<>();
		//		
		//		strList.add("BBB");
		//		strList.add("CCC");
		//		strList.add("DDD");
		//		strList.add("AAA");
		//		System.out.println(strList);
		////		strList.remove(1);
		////		System.out.println(strList);
		//		
		//		strList.sort(null);
		//		
		//		System.out.println(strList);








		//		List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
		//		System.out.println("Original list: " + listNames);
		//		List<String> subList = listNames.subList(2, 5);
		//		System.out.println("Sub list: " + subList);
		//		
		//		
		//		listNames.set(2, "Anthony");
		//		
		//		System.out.println("After changing the main list. Now the Sub list: \n" + subList);






	}

}
