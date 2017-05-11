package com.program.collection.hashset;

import java.util.Hashtable;

public class SearchAValue {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("one", "first");
		ht.put("two", "second");
		ht.put("three", "third");
		ht.put("four", "fourth");
		ht.put("five", "fivth");

		if (ht.containsValue("first")) {
			System.out.println("The HashTable contains key one");
		} else {
			System.out.println("The HashTable doesn't contains key one");
		}

		if (ht.containsValue("second")) {
			System.out.println("The HashTable contains key two");
		} else {
			System.out.println("The HashTable doesn't contains key two");
		}

		System.out.println("Main Method Ended");
	}
}
