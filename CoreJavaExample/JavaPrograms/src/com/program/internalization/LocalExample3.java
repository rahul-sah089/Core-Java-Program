package com.program.internalization;

import java.util.Locale;

public class LocalExample3 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Locale[] locales = { new Locale("en", "US"), new Locale("es", "ES"), new Locale("it", "IT"),
				new Locale("fr", "FR") };
		System.out.println("Displaying country and language name");
		for (int i = 0; i < locales.length; i++) {
			System.out.println("Country Name==>" + locales[i].getDisplayCountry() + " and Country language==>"
					+ locales[i].getDisplayLanguage());
		}
		System.out.println("Main Method Ended");
	}
}
