package com.program.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	public static void main(String[] args){
		System.out.println("Main method Started");
		List<String> workOutDays = new ArrayList<String>();
		workOutDays.add("Legs");
		workOutDays.add("Biceps");
		workOutDays.add("Chest");
		workOutDays.add("Back");
		System.out.println("Original list==>"+workOutDays);
		Collections.sort(workOutDays);
		System.out.println("Original list==>"+workOutDays);
		System.out.println("Main Method Ended");
	}
}
