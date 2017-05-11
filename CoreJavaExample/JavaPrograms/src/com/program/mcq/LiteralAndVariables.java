package com.program.mcq;

public class LiteralAndVariables {
	public static void main(String[] args) {
		example1();
		example2();
	}

	public static void example1() {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = a;
		int sum = 0;

		for (int j = 0; j < 3; ++j) {
			sum += (a[j] * b[j + 1]) + (b[j] * a[j + 1]);
		}
		System.out.println(sum);
	}

	public static void example2() {

		double a, b;
		a = 3.0;
		b = 4.0;
		double c = Math.sqrt(a * a + b * b);
		System.out.println(c);

	}

}
