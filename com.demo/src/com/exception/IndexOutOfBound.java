package com.exception;
//Create a Java program that demonstrates an ArrayIndexOutOfBoundsException.

public class IndexOutOfBound {
	public static void main(String[] args) {
		try {
			int[]numbers = {10,20,30,40,50};
			
			System.out.println(numbers[6]);		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}
		
	}

}
