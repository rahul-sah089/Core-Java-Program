package com.program.designpattern.creational.abstractfactory;

public class HDFC implements Bank {
	private final String BNAME;

	public HDFC() {
		BNAME = "ICICI BANK";
	}

	@Override
	public String getBankName() {
		return BNAME;
	}

}
