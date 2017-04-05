package com.program.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KnowYourDateFormat {
	public static void main(String[] args){
		//"", "", "
		System.out.println(getDate("2016-12-12"));
		System.out.println(getDate("Jul 18, 2011"));
		System.out.println(getDate("18-07-2011"));
		System.out.println(getDate("2011-07-18"));
		
	}
	
	public static Date getDate(String inputDate){
		System.out.println("Input date::"+inputDate);
		String[] date_formats = { "yyyy-MM-dd","yyyyy/MM/dd","dd/MM/yyyyy",  "dd-MM-yyyy", "yyyy MMM dd",
                "yyyy dd MMM","dd MMM yyyy",  "dd MMM",  "MMM dd",  "dd MMM yyyy"};
		Date date  =  null;
		String output_date = null;
		for(String format : date_formats){
			try{
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				date = sdf.parse(inputDate);
				System.out.println("Output Date format is ::"+format);
				break;
			}catch(Exception ex){
				System.out.println("Next!!!");
			}
		}
		return date;
	}
}
