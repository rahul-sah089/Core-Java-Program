package com.program.stackoverflow;

public class StackOverFlowError {
	public static void incrementNumber(int value){
		if(value == 0){
			return;
		}
		else{
			System.out.println(value);
			incrementNumber(value++);
		}
	}
	
	public static void main(String[] args){
		System.out.println("Main method Started");
		incrementNumber(1);
		System.out.println("Main method ended");
	}
}
