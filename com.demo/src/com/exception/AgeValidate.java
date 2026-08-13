package com.exception;

public class AgeValidate {
	public static void main(String[] args) {
		int age = 34 ;
		
		try {
			if (age < 18 ) {
				throw new IllegalArgumentException("age must be abouve 18 ");
			}
			System.out.println("user can vote");
		}
			catch(IllegalArgumentException e) {
			System.out.println( e.getMessage());
			
			}
		}
	}

