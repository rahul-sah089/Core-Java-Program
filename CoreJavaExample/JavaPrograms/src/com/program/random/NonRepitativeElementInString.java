package com.program.random;
import java.util.HashMap;
import java.util.Scanner;

public class NonRepitativeElementInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String values = in.nextLine();
		char[] c = getCharList(values);
		if (c.length == 0) {
			System.out.println("All word are repitative");
		} else {
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + ",");
			}
		}

	}

	public static char[] getCharList(String str) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		Character c;
		String count = "";
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (charCount.containsKey(c)) {

				charCount.put(c, (charCount.get(c) + 1));
			} else {
				charCount.put(c, 1);
			}
		}

		// iterrate thought the hashmap
		// push it to the char[] and return
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (charCount.get(c) == 1) {
				count += str.charAt(i);
			}
		}

		return count.toCharArray();
	}
}
