package com.scanner;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("do u want more food");
		String answer = sc.nextLine();
		
		if (answer.equals ("yes")) {
			System.out.println("here u go");
			
			System.out.println("do u want cold drink");
			String drink = sc.nextLine();
			
			if(drink.equals("yes")){
			System.out.println("heree is ur  cold drink");
			}
			else {
			System.out.println("sorry");
			}
			
			System.out.println("do u want dessert");
			String dessert = sc.nextLine();
			
			if (dessert.equals("yes")) {
				System.out.println("heree is ur dessert");
			}
				else {
					System.out.println("sorryy :)");				
				}				
					
		}
		
		else if (answer.equals("no")){
			System.out.println("sorryy");
		break;
		}				
	}
	}
}
