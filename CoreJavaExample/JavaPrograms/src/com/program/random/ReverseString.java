package com.program.random;
public class ReverseString {
	public static void main(String[] args) {
		String values = "This is rahul";
		System.out.println(reverseStr1(values));
		System.out.println(reverseStr2(values));
	}

	// string reversal without recursion
	public static String reverseStr1(String str) {
		String reverseStr = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	// string reversal using recursion
	public static String reverseStr2(String str) {
		String reverseStr = "";
		if (str.length() == 1) {
			return str;
		} else {
			reverseStr += str.charAt(str.length() - 1) + reverseStr2(str.substring(0, str.length() - 1));
			return reverseStr;
		}
	}
}
