package com.inheritance;

public class Mosquito extends Animal{
	void fly() {
		System.out.println("mosquito is flying");
	}
	
    @Override
    void eat () {
    	System.out.println("mosquito is dinkimg blood");
    }
}

