package com.program.misllenous;
//Divide a number by 2 without using / or * operator
public class DivideMultipleWithoutOperator {
	
	public static void main(String[] args){
		System.out.println("Result of multiply==>"+multipleBy2(8));
		System.out.println("Result of division==>"+divideBy2(8));
	}
	
	public static int multipleBy2(int num){
		return (num << 2);
	}
	
	public static int divideBy2(int num){
		return (num >>2);
	}
}
