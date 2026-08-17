package com.abstraction;

public class Cash extends Transaction {
	
	@Override
	void spending() {
		System.out.println("payment is done via cash");
	}

}
