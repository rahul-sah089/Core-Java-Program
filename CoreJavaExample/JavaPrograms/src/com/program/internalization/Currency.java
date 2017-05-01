package com.program.internalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.ITALIAN);
		printCurrency(Locale.SIMPLIFIED_CHINESE);
		printCurrency(Locale.JAPANESE);
		System.out.println("Main Method Ended");
	}
	
	public static void printCurrency(Locale locale){
		double dl = 10500.12;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String curency = formatter.format(dl);
		System.out.println(curency+" for locale "+locale);
	}
}
