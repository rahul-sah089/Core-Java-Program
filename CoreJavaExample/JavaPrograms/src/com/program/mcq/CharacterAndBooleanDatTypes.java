package com.program.mcq;

public class CharacterAndBooleanDatTypes {
	public static void main(String[] args) {
		example1();
		example2();
		example3();
		example4();
		example5();
	}

	public static void example1() {
		char array_variable[] = new char[10];
		for (int i = 0; i < 10; ++i) {
			array_variable[i] = 'i';
			System.out.print(array_variable[i] + " ");
			i++;
		}
		System.out.println();
	}

	public static void example2() {
		char ch = 'A';
		ch++;
		System.out.println((int) ch);
	}

	public static void example3() {
		boolean var1 = true;
		boolean var2 = false;
		if (var1) {
			System.out.println(var1);
		} else {
			System.out.println(var2);
		}
	}
	
	public static void example4(){
		boolean var1 = true;
		boolean var2 = false;
		System.out.println((var1 && var2));
	}
	
	public static void example5(){
		char v1 = 'A';
		char v2 = 'a';
		System.out.println((int)v1 + " " + (int) v2);
	}
}
