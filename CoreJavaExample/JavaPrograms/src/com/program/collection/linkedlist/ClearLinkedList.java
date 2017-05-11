package com.program.collection.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*
 * IT will remove all the elements from the list.
 */
public class ClearLinkedList {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		List<String> li = new ArrayList<String>();
		li.add("Forex");
		li.add("Exchange");
		li.add("Section");
		System.out.println("Before removing ==>"+li);
		li.clear();
		System.out.println("After clearing ==>"+li);
		System.out.println("Main Method Ended");
	}
}
