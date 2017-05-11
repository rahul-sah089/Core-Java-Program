package com.program.collection.hashset;

import java.util.Hashtable;

public class HashTableBasic {
	public static void main(String[] args){
		//Create hashtable instance
		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("one", "FOREX exhange department");
		ht.put("two","Money Tranasfer Agent ");
		ht.put("three","add transaction");
		ht.put("four", "buy transaction");
		ht.put("five", "sell transaction");
		
		System.out.println("Values of three ==>"+ht.get("three"));
		System.out.println("Values of four ==>"+ht.get("four"));
		ht.remove("three");
		System.out.println(ht);
		System.out.println("Is HashTable Empty?? "+ht.isEmpty());
		System.out.println("Size of the hashtable==>"+ht.size());
		
		
		
	}
}
