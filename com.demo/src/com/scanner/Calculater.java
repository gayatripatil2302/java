package com.scanner;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
	//step 1. create object 
	//step 2. write ststem.in in bracket
	Scanner sc = new Scanner(System.in);
	
	// step 3. initialize value
	System.out.println("type value a");
	int a = sc.nextInt();
	
	System.out.println("type value b");
	int b = sc.nextInt();
	
	int sum = a+b;
	int sub = a-b;
	int div = a/b;
	int mul = a*b;
	
	System.out.println("answer of addition of two numbers = "+sum);
	System.out.println("answer of subtraction of two numbers = "+sub);
	System.out.println("answer of division of two numbers = "+div);
	System.out.println("answer of multiplication of two numbers = "+mul);
	
	sc.close();	

	}

}
