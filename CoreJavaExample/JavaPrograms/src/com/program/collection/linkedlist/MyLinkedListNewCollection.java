package com.program.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Here we can see example for copying another collection instance objects to existing LinkedList.
 */
public class MyLinkedListNewCollection {
	public static void main(String[] args) {
		System.out.println("Adding one list content to another");
		LinkedList<String> li = new LinkedList<String>();
		li.add("Forex");
		li.add("Buereau");
		li.add("BUY/SELL");
		li.add("currency");
		System.out.println("Actual list ==>" + li);

		List<String> list = new ArrayList<String>();
		list.add("MTA");
		list.add("Module");

		li.addAll(list);

		System.out.println("After alteration ==>" + li);
	}
}
