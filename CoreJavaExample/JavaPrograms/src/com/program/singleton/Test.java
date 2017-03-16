package com.program.singleton;

public class Test {
	public static void main(String[] args){
		System.out.println("Main Method Started 1");
		SingleTon singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		System.out.println("Main Method Ended 1");
		
		
		System.out.println("Main Method Started 2");
		SingleTonUsingStaticBlock singleTon1 = SingleTonUsingStaticBlock.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		singleTon = SingleTon.getInstance();
		System.out.println("singleTon==>"+singleTon.toString());
		System.out.println("Main Method Ended 2");
	}
}
