package com.program.recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	public static int factorial(int n) {
		int factorial = n;
		if (n == 1) {
			return factorial;
		} else {
			return factorial * factorial(n - 1);
		}
	}
}
