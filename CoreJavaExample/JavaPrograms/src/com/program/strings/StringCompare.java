package com.program.strings;

//If two string are equals . It will give 0
//If two string are not equals . IT will give non zero values
public class StringCompare {
	public static void main(String[] args){
		String str1 = "Hello World";
		String str2 = "hello World";
		Object str = str1;
		
		System.out.println("String compare 1 ==>"+str1.compareTo(str2));
		System.out.println("String compare 2 ==>"+str1.compareToIgnoreCase(str2));
		System.out.println("String compare 3 ==>"+str1.compareTo(str.toString()));
		
		
		
	}
}
