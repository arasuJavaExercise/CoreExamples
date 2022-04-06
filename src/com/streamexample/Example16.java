package com.streamexample;

import java.util.stream.Stream;

/**
 * Program to illustrate the Stream iterator operation
 *
 */
public class Example16 {

	public static void main(String[] args) {
		
		System.out.println("a. Iterate from 1 to 10");
		Stream.iterate(1, ele->ele+1).limit(10).forEach(System.out::println);
		
		System.out.println("\nb. Iterate multiplication of 5 table from 1 to 10");
		Stream.iterate(1, ele -> ele + 1)
		.filter(ele -> ele % 5 == 0)
		.limit(10)
		.forEach(System.out::println);
	}

}
