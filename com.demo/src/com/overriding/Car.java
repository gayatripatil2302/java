package com.overriding;

public class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("car start with a key");
	}
	

}
