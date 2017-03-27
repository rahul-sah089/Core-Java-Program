package com.program.misllenous;

import java.util.HashMap;
import java.util.Set;

/*
 * Write a java program to find duplicate characters 
 * and their count in a given string? 
 * For example, in a string “Better Butter”, duplicate characters and their count 
 * is t : 4, e : 3, r : 2 and B : 2.
 * 
 */
public class FindDuplicateInString {
	public static void main(String[] args) {
		System.out.println("Main method started");
		printDuplicate("Better Butter");
		System.out.println("Main method ended");
	}

	public static HashMap<Character, Integer> getCharCount(String str) {
		HashMap<Character, Integer> charCount = new HashMap<>();
		str = str.replaceAll("\\s", "").toLowerCase();
		char[] charArr = str.toCharArray();
		for (char alpha : charArr) {
			if (charCount.containsKey(alpha)) {
				charCount.put(alpha, (charCount.get(alpha) + 1));
			} else {
				charCount.put(alpha, 1);
			}
		}
		return charCount;
	}

	public static void printDuplicate(String str) {
		HashMap<Character, Integer> charCount = getCharCount(str);
		Set<Character> charSet = charCount.keySet();
		for (char ch : charSet) {
			if (charCount.get(ch) > 1) {
				System.out.print(ch + ":" + charCount.get(ch)+ ",");
			}
		}
		System.out.println();
	}
}
