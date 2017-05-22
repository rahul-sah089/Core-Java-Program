package com.program.datastructure.stack;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		BasicStack basicStack = new BasicStack();
		System.out.println("Data pushed");
		basicStack.push(12);
		basicStack.push(24);
		basicStack.push(36);
		basicStack.push(48);
		basicStack.push(60);
		basicStack.push(72);
		System.out.println("Pop time now");
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println(basicStack.pop());
		System.out.println("Main Method Ended");
	}
}
