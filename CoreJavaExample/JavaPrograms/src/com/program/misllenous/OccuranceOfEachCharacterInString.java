package com.program.misllenous;

import java.util.HashMap;

/*
 * Given a string , you have to count the number of occurrences of each character in it.
 * For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each
 * character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.
 * 
 */
public class OccuranceOfEachCharacterInString {
	public static void main(String[] args) {
		String str = "Java J2EE Java JSP J2EE";
		System.out.println(findOccurance(str));
	}

	public static HashMap findOccurance(String str) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		str = str.replaceAll("\\s", "").toLowerCase();
		char[] charArray = str.toCharArray();
		for (char alpha : charArray) {
			if (charCount.containsKey(alpha)) {
				charCount.put(alpha, (charCount.get(alpha) + 1));
			} else {
				charCount.put(alpha, 1);
			}
		}
		return charCount;
	}
	
	
	
	
}
