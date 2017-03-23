package com.program.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NumberOfDaysBetweenDate {
	public static void main(String[] args) {
		long difference = getDaysDifference("12/12/2013", "2/12/2012");
		System.out.println("Days difference ==>"+difference);
	}

	public static long getDaysDifference(String toDate, String fromDate) {
		Date toDateObj = null;
		Date fromDateObj = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			fromDateObj = sdf.parse(fromDate);
		} catch (ParseException ex1) {
			System.out.println("Error in from date format");
		}

		try {
			toDateObj = sdf.parse(toDate);
		} catch (ParseException ex2) {
			System.out.println("Error in to date format");
		}

		System.out.println("To date==>"+toDateObj);
		System.out.println("From date==>"+fromDateObj);
		long diff = toDateObj.getTime() - fromDateObj.getTime();
		long differnce = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return differnce;
	}
}
