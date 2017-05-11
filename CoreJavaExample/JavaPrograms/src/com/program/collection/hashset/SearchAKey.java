package com.program.collection.hashset;

/*
 * Description:
 * Below example shows how to search a key from the Hashtable.
 * The method containsKey() helps us to find whether the specified key exists or not.
 */
import java.util.Hashtable;

public class SearchAKey {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("one", "FOREX exhange department");
		ht.put("two", "Money Tranasfer Agent ");
		ht.put("three", "add transaction");
		ht.put("four", "buy transaction");
		ht.put("five", "sell transaction");

		if (ht.containsKey("one")) {
			System.out.println("The HashTable contains key one");
		} else {
			System.out.println("The HashTable doesn't contains key one");
		}

		if (ht.containsKey("two")) {
			System.out.println("The HashTable contains key two");
		} else {
			System.out.println("The HashTable doesn't contains key two");
		}

		System.out.println("Main Method Ended");
	}
}
