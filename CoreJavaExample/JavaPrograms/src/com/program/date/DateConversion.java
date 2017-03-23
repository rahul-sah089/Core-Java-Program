package com.program.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
	public static void main(String[] args) {
		System.out.println("Main thread stared");
		dateConversion("23/03/2017");
		System.out.println("Main thread ended");
	}
	// output.date.format=

	public static String dateConversion(String inputDate) {
		SimpleDateFormat sdfFrom = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfTo = new SimpleDateFormat("dd-MM-yyyy");
		String toDate = "";
		try {
			Date date = sdfFrom.parse(inputDate);
			System.out.println("date==>"+date);
			toDate = sdfTo.format(date);
			
			
		} catch (ParseException ps) {
			ps.printStackTrace();
		}

		return toDate;
	}
}
