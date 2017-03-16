package com.program.strings;

public class RecerseStringUsingRecurssion {
	String reverse = "";
	public static void main(String[] args) {
		RecerseStringUsingRecurssion recurssion = new RecerseStringUsingRecurssion();
		System.out.println(recurssion.reverseStr("hello World"));;
	}

	public String reverseStr(String str) {
		if (str.length() == 1) {
			return str;
		}
		else{
			reverse+= (reverse.length()-1) + reverseStr(str.substring(0, str.length()-1));
			return reverse;
		}
	}
}
