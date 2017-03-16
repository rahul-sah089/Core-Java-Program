package com.program.singleton;

public class SingleTonUsingStaticBlock {
	private static SingleTonUsingStaticBlock ton;

	private SingleTonUsingStaticBlock() {
		// TODO Auto-generated constructor stub
	}

	static {
		ton = new SingleTonUsingStaticBlock();
	}

	public static SingleTonUsingStaticBlock getInstance() {
		return ton;
	}

}
