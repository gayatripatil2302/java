package com.exception;
//Write a Java program that generates an ArithmeticException by dividing a number by zero.

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		try {
			int a =20;
			int b = 10;	
			int result = a/b ;
			System.out.println(result);	
		}
		catch (ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
		finally {
			System.out.println("finally block is excuted");
		}		
	}
}
