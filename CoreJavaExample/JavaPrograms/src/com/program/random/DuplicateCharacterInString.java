package com.program.random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		HashMap<Character, Integer> hashMap = makeMap(str);
		System.out.println(getDuplicateChar(hashMap));
		System.out.println("Main Method Ended");
	}

	public static HashMap<Character, Integer> makeMap(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		return hashMap;
	}

	public static List<Character> getDuplicateChar(HashMap<Character, Integer> hashMap) {
		List<Character> chars = new ArrayList<>();
		Set<Character> keys = hashMap.keySet();
		for (Character ch : keys) {
			if (hashMap.get(ch) > 1) {
				chars.add(ch);
			}
		}
		return chars;
	}
}
