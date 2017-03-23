package com.program.strings;

public class ConvertingIntToString {
	// converting integer to string using toString()
	public String method1(int value) {
		Integer i = new Integer(value);
		String str = i.toString();
		return str;
	}

	public String method2(int value) {
		String str = String.valueOf(value);
		return str;
	}

	public String method3(int value) {
		String str = String.format("%d", value);
		return str;
	}

}
