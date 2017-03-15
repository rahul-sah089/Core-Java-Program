package com.program.strings;
/*
 * This example shows how we can search a word within a String object 
 * using indexOf() method which returns a position index of a word 
 * within the string if found. Otherwise it returns -1.*/

public class SearchSubStringInString {
	public static void main(String[] args){
		searchString("My name is rahul","rahul");
		searchString("rahul sah","rahul");
		searchString("sah rahul","rahul");
		searchString("rararahul","rahul");
		searchString("My name is sunil","rahul");
	}
	public static void searchString(String string,String subString){
		int index = string.indexOf(subString);
		if(index == -1){
			System.out.println("SubString doesn't exist");
		}else{
			System.out.println("SubString exist at position::"+index);
		}
	}
}
