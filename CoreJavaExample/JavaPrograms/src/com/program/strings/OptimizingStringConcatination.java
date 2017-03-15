package com.program.strings;

import javax.swing.plaf.synth.SynthSeparatorUI;

//String append can be used using "+" operator or StringBuffer.append() method 
public class OptimizingStringConcatination {
	public static void main(String[] args){
		long startTime0 = System.currentTimeMillis();
		for(int i= 0 ; i < 50000;i++){
			String result  = "This is testing difference "
					+ "between String and StringBuffer";
			
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("Time taken for String contentaion using '+' operator "+(endTime0-startTime0)+" ms");
		
		long startTime1 = System.currentTimeMillis();
		for(int i= 0 ; i < 50000;i++){
			String result  = "This is testing difference "
					+ "between String and StringBuffer"+i;
			
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for String contentaion using '+' operator "+(endTime1-startTime1)+" ms");
		
		long startTime2 = System.currentTimeMillis();
		for(int i= 0 ; i < 50000;i++){
			StringBuffer strBuff  = new StringBuffer();
			strBuff.append("This is ");
			strBuff.append("testing difference ");
			strBuff.append("between String ");
			strBuff.append("and StringBuffer ");	
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Time taken for the String concentination using stringBuffer "+(endTime2-startTime2)+ "ms");
		
	}
	
	
}
