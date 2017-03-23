package com.program.strings;

public class ReverseVowelInString {
	public static void main(String[] args) {
		System.out.println("Main Method started");
		String reversed = reverseVowel("rahulsaah");
		System.out.println("Reversed vowel==>" + reversed);
		System.out.println("Main Method ended");
	}

	public static String reverseVowel(String s) {
		char[] inpArr = s.toCharArray();
		String vowel = "aeiouAEIOU";
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (!vowel.contains(String.valueOf(s.charAt(i)))) {
				i++;
				continue;
			}
			if (!vowel.contains(String.valueOf(s.charAt(j)))) {
				j--;
				continue;
			}
			char temp = s.charAt(i);
			inpArr[i] = inpArr[j];
			inpArr[j] = temp;

			i++;
			j--;
		}
		return new String(inpArr);
	}
}
