package com.program.designpattern.creational.factory;

abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBills(int unit) {
		System.out.println("Units==>" + unit * rate);
	}

}
