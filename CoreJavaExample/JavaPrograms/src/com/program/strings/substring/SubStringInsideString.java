package com.program.strings.substring;

public class SubStringInsideString {
	public static void main(String[] args){
		subString("My name is rahul","rahul");
		subString("rahul sah","rahul");
		subString("sah rahul","rahul");
		subString("rararahul","rahul");
		subString("My name is sunil","rahul");
		
		
	}
	
	public static void subString(String str1,String str2){
		int index = str1.lastIndexOf(str2);
		if(index == -1){
			System.out.println("subString not found");
		}
		else
			System.out.println("SubString found at index==>"+index);
	}
}
