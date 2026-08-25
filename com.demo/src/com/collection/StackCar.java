package com.collection;

import java.util.Stack;

public class StackCar {
	public static void main(String[] args) {
		Stack<String> cars = new Stack<>();
		cars.push("aura");
		cars.push("victories");
		cars.push("venue");
		cars.push("punch");
		
		cars.pop();
		cars.pop();
	
		System.out.println("cars we have");
		for(String a: cars) {
			System.out.println(a);
		}
		
		
	}

}
