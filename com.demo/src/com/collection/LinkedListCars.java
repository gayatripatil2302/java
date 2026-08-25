package com.collection;

import java.util.LinkedList;

public class LinkedListCars {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("bmw");
		cars.add("aura");
		cars.add("ford");
		cars.add("tata");
		
		System.out.println("types of cars");
		for (String a : cars ) {
			System.out.println(a);
		}
		
	}
}
