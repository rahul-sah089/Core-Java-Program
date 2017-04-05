package com.program.designpattern.creational.abstractfactory;

public class ICICI implements Bank {
	private final String BNAME;

	public ICICI() {
		BNAME = "HDFC BANK";
	}

	@Override
	public String getBankName() {
		return BNAME;
	}

}
