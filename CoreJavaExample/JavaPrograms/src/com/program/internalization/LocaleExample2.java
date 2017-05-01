package com.program.internalization;

import java.util.Locale;

public class LocaleExample2 {
	public static void main(String[] args){
		System.out.println("Main method started");
		Locale enLocale = new Locale("en", "US");
		Locale frLocale = new Locale("fr", "FR");
		Locale esLocale = new Locale("es", "ES");
		System.out.println("Language Country==>"+enLocale.getCountry()+" and  language name==>"+enLocale.getDisplayLanguage());
		System.out.println("Language Country==>"+frLocale.getCountry()+" and  language name==>"+frLocale.getDisplayLanguage());
		System.out.println("Language Country==>"+esLocale.getCountry()+" and  language name==>"+esLocale.getDisplayLanguage());
		System.out.println("Main method ended");
	}
}
