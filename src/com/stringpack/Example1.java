package com.stringpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Program To Find Number Of Characters, Words And Lines In File In Java
 *
 */
public class Example1 {

	public static void main(String[] args) throws IOException {

		int lineCnt = 0;
		int wordCnt = 0;
		int characterCnt = 0;

		File file = new File("src\\com\\stringpack\\sample.txt");
		System.out.println(file.getAbsolutePath());
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentLine = reader.readLine();
		while (currentLine != null) {

			lineCnt = lineCnt + 1;

			String textwords[] = currentLine.split(" ");
			wordCnt = wordCnt + textwords.length;

			for (String word : textwords) {
				characterCnt = characterCnt + word.length();
			}

			currentLine = reader.readLine();
		}
		reader.close();
		System.out.println(
				"Line Count : " + lineCnt + ", Word Count : " + wordCnt + ", Character Count : " + characterCnt);

	}

}
