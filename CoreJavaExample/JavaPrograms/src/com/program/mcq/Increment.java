package com.program.mcq;

public class Increment {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		int g = 3;
		System.out.println(++g * 8);
		System.out.println("Main Method Ended");
	}
	/*
	 * Operator ++ is having more precedence than *. thus g becomes 4 before multipilication
	 */
}
