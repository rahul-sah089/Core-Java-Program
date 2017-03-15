package com.program.strings;

public class StringSplit {
	public static void main(String[] args) {
		//split by delimiter "-"
		String str1 = "jan-feb-mar-april-may-june-july";
		String[] temp1 = str1.split("-");
		for (String month : temp1) {
			System.out.println(month);
		}
		
		System.out.println("=====================================");

		//Split by delimiter "."
		String str2 = "jan.feb.march.april.may.june.july";
		String[] temp2 = str2.split("\\.");
		for (String month : temp2) {
			System.out.println(month);
		}
		
		//Split by delimiter => "space"
		System.out.println("=======================================");
		
		String str3 = "rahul sah is a good boy";
		String[] temp3 = str3.split("\\s");
		for(String str : temp3){
			System.out.println(str);
		}

	}

}
