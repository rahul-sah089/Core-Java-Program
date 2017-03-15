package com.program.strings;

public class StringPerformanceCompare {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		for(int i= 0 ; i < 50000;i++){
			String str1 = "rahul";
			String str2 = "sah";
		}
		
		long endTime =  System.currentTimeMillis();
		System.out.println("Performance 1 ==>"+(endTime-startTime));
		
		
		startTime = System.currentTimeMillis();
		for(int i= 0 ; i < 50000;i++){
			String str1 = new String("rahul");
			String str2 = new String("sah");
		}
		
		endTime =  System.currentTimeMillis();
		System.out.println("Performance 2 ==>"+(endTime-startTime));
	}
}
