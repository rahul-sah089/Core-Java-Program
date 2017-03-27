package com.program.strings;

import java.util.Arrays;

/*
 * Two strings are called anagrams if they contain same set of characters
 * but in different order. For example, 
 * “Dormitory – Dirty Room”, “keep – peek”,
 *	“School Master – The Classroom” are some anagrams.
 * 
 */
/*
 * Method :
 * 1) Remove the space
 * 2) Check the length
 * 3) Sort each of the string
 * 4) Use equals method to compare
 */
public class AnagramProgram {

	public static void main(String[] args){
		String str1 = "Dormitory";
		String str2 = "Dirty Room";
		checkAnagram(str1, str2);
	}
	
	public static void checkAnagram(String str1, String str2) {
		if (isAnagram(str1, str2)) {
			System.out.println("It is anagram");
		} else {
			System.out.println("It is not anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		// 1) Remove the space
		boolean status = true;
		String cp1 = str1.replaceAll("\\s", "");
		String cp2 = str2.replaceAll("\\s", "");

		// 2) Check there length
		if (cp1.length() != cp2.length()) {
			status = false;
		}

		char[] cp1Arr = cp1.toLowerCase().toCharArray();
		char[] cp2Arr = cp2.toLowerCase().toCharArray();

		Arrays.sort(cp1Arr);
		Arrays.sort(cp2Arr);

		if (Arrays.equals(cp1Arr, cp2Arr)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
}
