package com.program.strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		System.out.println("Main method started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = in.nextLine();
		String rev= reversed(str);
		System.out.println("Reversed string ==>"+rev);
		in.close();
		System.out.println("Main method ended");
	}
	
	public static String reversed(String str){
		String reverse = new StringBuffer(str).reverse().toString();
		return reverse;
	}
	
	
}
