package com.program.internalization;

import java.util.Locale;

public class Basic {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		Locale locale = Locale.getDefault();
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println("Main Method Ended");
	}
}
