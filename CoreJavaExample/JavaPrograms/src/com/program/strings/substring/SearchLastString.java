package com.program.strings.substring;
//The example shows how to determine the last index of substring inside a string 
//with the help of str.lastIndexOf(StringName) method
public class SearchLastString {
	public static void main(String[] args){
		System.out.println("Main method started");
		String strRep = "Rahul Sah want to make lean muscle,muscle are build by weight lifting sessions!!!";
		int index = strRep.lastIndexOf("muscle");
		if(index == -1){
			System.out.println("Index not found");
		}else{
			System.out.println("The substring found at index "+index);
		}
		System.out.println("Main method ended");
	}
}
