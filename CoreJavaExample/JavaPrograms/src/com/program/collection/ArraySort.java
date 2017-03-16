package com.program.collection;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args){
		String[] arrs = new String[]{"Shoulder","Back","Chest","Biceps"};
		System.out.println("Content of string without sorting==>");
		for(String str : arrs){
			System.out.print(str+",");
		}
		Arrays.sort(arrs);
		System.out.println("\nAfter sorting==>");
		for(String str:arrs){
			System.out.print(str+",");
		}
		
	}
}
