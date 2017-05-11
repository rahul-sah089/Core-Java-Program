package com.program.collection.hashset;

import java.util.Hashtable;

public class DeletingAllElement {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("one", "first");
		ht.put("two", "second");
		ht.put("three", "third");
		ht.put("four", "fourth");
		ht.put("five", "fivth");
		
		System.out.println("Before ==>"+ht);
		ht.clear();
		System.out.println("After ==>"+ht);
	}
}
