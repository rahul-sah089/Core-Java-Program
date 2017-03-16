package com.program.singleton;

public class SingleTon {
	private static SingleTon singleTon;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}
}
