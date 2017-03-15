package com.program.strings;

public class StringReplacment {
	public static void main(String[] args){
		System.out.println("Main method started");
		String str = "Hello World!!";
		String str1 = str.replace("H", "W");
		String str2 = str.replaceFirst("He", "Wa");
		String str3 = str.replaceAll("He", "Wa");
		System.out.println("Replace 1==>"+str1);
		System.out.println("Replace 2==>"+str2);
		System.out.println("Replace 3==>"+str3);
		System.out.println("Main method ended");
	}
}
