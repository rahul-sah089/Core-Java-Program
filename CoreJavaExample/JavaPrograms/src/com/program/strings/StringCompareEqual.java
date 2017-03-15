package com.program.strings;

public class StringCompareEqual {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		String s1 = "tutorialsPoint";
		String s2 = "tutorialsPoint";
		String s3 = new String("Tutorials Point");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("Main method ended");
	}
}
