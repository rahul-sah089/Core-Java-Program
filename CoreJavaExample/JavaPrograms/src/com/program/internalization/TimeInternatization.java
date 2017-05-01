package com.program.internalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeInternatization {
	public static void main(String[] args) {
		printTime(Locale.CANADA);
		printTime(Locale.US);
		printTime(Locale.UK);
		printTime(Locale.FRANCE);
		printTime(Locale.GERMAN);
	}

	public static void printTime(Locale locale) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date = df.format(currentDate);
		System.out.println(date+" "+" for locale "+locale);
	}
}
