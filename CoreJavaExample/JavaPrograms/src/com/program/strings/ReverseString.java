package com.program.strings;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseStrUsingCharArr("Rahul Sah"));
		System.out.println(reverseString("Rahul Sah"));
		System.out.println(reverseSimple("Rahul Sah"));
	}

	// reverse string using string buffer internal function
	public static String reverseSimple(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	// reverse string using char array
	public static String reverseStrUsingCharArr(String str) {
		StringBuffer strBuff = new StringBuffer();
		char[] strArr = str.toCharArray();
		for (int ii = strArr.length - 1; ii >= 0; ii--) {
			strBuff = strBuff.append(strArr[ii]);
		}
		return strBuff.toString();
	}

	// reverse string using string
	public static String reverseString(String str) {
		StringBuffer strBuf = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			strBuf = strBuf.append(str.charAt(i));
		}
		return strBuf.toString();
	}
	
	

}
	