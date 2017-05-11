package com.program.collection.hashset;

import java.util.Hashtable;
import java.util.Set;

public class HashTableIteration {
	public static void main(String[] args) {
		System.out.println("Main method started");
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("one", "FOREX exhange department");
		ht.put("two", "Money Tranasfer Agent ");
		ht.put("three", "add transaction");
		ht.put("four", "buy transaction");
		ht.put("five", "sell transaction");

		Set<String> keys = ht.keySet();
		for (String key : keys) {
			System.out.println("key is '" + key + "' and the value is '" + ht.get(key)+"'");
		}
		System.out.println("Main method ended");
	}
}
