package com.program.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemovingElement {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		List<String> li = new ArrayList<String>();
		li.add("rahul");
		li.add("is");
		li.add("fucking");
		li.add("awesome");
		System.out.println(li);
		li.clear();
		System.out.println(li);
		System.out.println("Main Method Ended");
	}
}
