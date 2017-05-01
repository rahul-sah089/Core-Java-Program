package com.program.internalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Number {
	public static void printNumber(Locale locale){
		double dl = 0.1234;
		NumberFormat format = NumberFormat.getNumberInstance(locale);
		String num = format.format(dl);
		System.out.println(num + " Number for the locale "+locale);
	}
	
	public static void main(String[] args){
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.CHINESE);
		printNumber(Locale.FRENCH);
		printNumber(Locale.GERMAN);
	}
}
