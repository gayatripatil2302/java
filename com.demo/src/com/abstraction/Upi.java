package com.abstraction;

public class Upi extends Transaction {
	@Override 
	void spending () {
		System.out.println("payment is done via credit upi");
	}

}
