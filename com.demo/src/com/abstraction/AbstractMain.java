package com.abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		Transaction transaction ;
		
		transaction = new Cash();
		transaction.spending();
		
		transaction = new Upi();
		transaction.spending();
		
		transaction = new CreditCard();
		transaction.spending();

	}

}

















