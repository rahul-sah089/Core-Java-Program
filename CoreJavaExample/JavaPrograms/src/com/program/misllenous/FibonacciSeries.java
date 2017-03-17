package com.program.misllenous;

public class FibonacciSeries {
	public static void main(String[] args) {
		fib(12);
	}

	public static void fib(int limit) {
		int firstNumber = 0;
		int secondNumber = 1;
		int result = 0;
		int count = 1;
		System.out.print(firstNumber+","+secondNumber+",");
		while (count != limit-1) {
			result = firstNumber + secondNumber;
			System.out.print(result + ",");
			firstNumber = secondNumber;
			secondNumber = result;
			count++;
		}
	}
}
