package com.stringpack;

import java.util.*;

/**
 * Program To Find Duplicate Characters In A String
 *
 */
public class Example3 {

	public static void main(String[] args) {
		
		findDuplicateCharacters("Arasu Kumar Gowda");
		findDuplicateCharacters("Chandru Shekar Gowda");
		findDuplicateCharacters("Pruthvik Gowda");
	}

	private static void findDuplicateCharacters(String chrStr) {

		Map<Character, Integer> charCount = new HashMap<>();
		chrStr = chrStr.replaceAll("\\s", "");
		char[] characters = chrStr.toCharArray();

		for (int i = 0; i < characters.length; i++) {

			char ch = characters[i];
			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
			} else {
				charCount.put(ch, 1);
			}

		}
		
		System.out.println(charCount);
	}

}
