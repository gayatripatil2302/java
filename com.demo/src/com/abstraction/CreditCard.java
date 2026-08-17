package com.abstraction;

public class CreditCard extends Transaction{
	@Override
	void spending() {
		System.out.println("payment is done via credit card");
	}

}
