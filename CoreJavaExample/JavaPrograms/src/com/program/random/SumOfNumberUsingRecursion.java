package com.program.random;

public class SumOfNumberUsingRecursion {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(sum(1356));
		System.out.println("Main Method Ended");
	}

	public static int sum(int n) {
		int sum = 0;
		if(n == 0){
			return sum;
		}
		sum  += n%10 + sum(n/10);
		return sum;
	}
}
