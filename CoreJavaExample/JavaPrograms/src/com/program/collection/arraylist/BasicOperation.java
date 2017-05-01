package com.program.collection.arraylist;

import java.util.ArrayList;
import java.util.List;



public class BasicOperation {
	public static void main(String[] args){
		System.out.println("ArrayList basis operations");
		List<String> li = new ArrayList<String>();
		li.add("rahul");
		li.add("is");
		li.add("a");
		li.add("java");
		li.add("freak");
		System.out.println("Element at index 1==>"+li.get(1));
		System.out.println("Does list contains java??"+li.contains("java"));
		System.out.println("Is the list empty==>"+li.isEmpty());
		System.out.println("Index of rahul "+li.indexOf("rahul"));
		System.out.println("Size of list "+li.size());
	}
}
