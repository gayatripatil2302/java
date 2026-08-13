package com.exception;
//Create a Java program that intentionally generates a NullPointerException and explain why it occurs.
public class NullPointerExcep {
	public static void main(String[] args) {
		
		try {
			String name  = null;
			System.out.println(name.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException occurred");
		}
	}

}
