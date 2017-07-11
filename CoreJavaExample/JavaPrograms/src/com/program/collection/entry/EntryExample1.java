package com.program.collection.entry;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntryExample1 {
	public static void main(String[] args) {
		HashMap<Character, Integer> vals = new HashMap<Character, Integer>();
		vals.put('A', 1);
		vals.put('B', 2);
		vals.put('C', 3);
		vals.put('D', 4);

		Set<Entry<Character, Integer>> entries = vals.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key=>" + entry.getKey() + " and value=>" + entry.getValue());
		}

	}
}
