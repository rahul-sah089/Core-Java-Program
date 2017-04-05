package com.program.stackoverflow;

public class Factorial {
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args){
		System.out.println("Main method started");
		int result = Factorial.factorial(-1);
		System.out.println("Factorial ==>"+result);
		System.out.println("Main method ended");
	}
}
