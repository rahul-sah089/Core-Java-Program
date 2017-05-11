package com.program.collection.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*
 * Here we can see example for finding whether the instance of an LinkedList contains 
 * all objects of another Collection instance. Here we are checking with another List instance.
 */
public class ContainsAllList {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		List<String> li1 = new ArrayList<String>();
		li1.add("Random");
		li1.add("Guy");
		li1.add("Next");
		li1.add("Door");
		
		List<String> li2 = new ArrayList<String>();
		li2.add("Random");
		li2.add("Guy");
		
		System.out.println("Does list1 contains list2 ==>"+li1.containsAll(li2));
		System.out.println("Main Method Ended");
	}
}
