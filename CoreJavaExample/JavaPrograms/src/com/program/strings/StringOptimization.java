package com.program.strings;
/* 1) If String literal is been used the string is returned from the string pool
 * 2) If new keyword is been used then the new string object is been created in the heap area
 * 3) If intern keyword is used with new keyword then the string is returned from string pool only
 * */ 
public class StringOptimization {
	public static void main(String[] args) {
		String variables[] = new String[50000];
		for (int i = 0; i < 50000; i++) {
			variables[i] = "s" + i;
		}

		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = "hello";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("Creation time of String literal::" + (endTime0 - startTime0) + " ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Creation time of String object using 'new' keyword " + (endTime1 - startTime1) + " ms");

		long startTime2 = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
			variables[i] = variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Creation time of String object with intern() " + (endTime2 - startTime2) +"ms");

	}
}
