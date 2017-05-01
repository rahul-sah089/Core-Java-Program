package com.program.collection.arraylist;

import java.util.ArrayList;
import java.util.List;
/*
 * Description 1:
 * 
 * 
 */

public class SubList {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		List<String> li = new ArrayList<String>();
		li.add("Rahul");
		li.add("is");
		li.add("freaking");
		li.add("awesome");
		System.out.println("Actual arrayList==>"+li);
		List<String> splitted = li.subList(2, 3);
		System.out.println(splitted);
		System.out.println("Main Method Ended");
	}
}
