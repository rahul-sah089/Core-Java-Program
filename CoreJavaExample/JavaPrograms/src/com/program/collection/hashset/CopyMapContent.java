package com.program.collection.hashset;

/*
 * Description :
 * Below example shows how to copy another collection object to Hashtable.
 * Below example copies all HashMap entries to Hashtable.
 * putAll() method helps us to copy another collection object.
 *  
 */
import java.util.Hashtable;

public class CopyMapContent {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("one", "FOREX exhange department");
		ht1.put("two", "Money Tranasfer Agent ");
		ht1.put("three", "add transaction");

		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht2.put("four", "buy transaction");
		ht2.put("five", "sell transaction");

		System.out.println("ht1 content before  " + ht1);
		ht1.putAll(ht2);
		System.out.println("ht2 content after " + ht1);

		System.out.println("Main Method Ended");
	}
}
