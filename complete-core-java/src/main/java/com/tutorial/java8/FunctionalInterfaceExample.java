package com.tutorial.java8;

/**
 * 
 * @author pradnya.khairnar
 *
 * Functional interface can not extend other functional interface.
 */

@FunctionalInterface
interface Sayable1 extends Sayable3 {
	
	// contains only 1 abstract method 
	void say();
	
	// void sayMore(); gives error
	
	// Functional interface can have static method
	static void sayMore() { 
		System.out.println("\nStatic sayMore() method invoked.");
	}
	
	// Functional interface can have default method
	default void sayNothing() {
		System.out.println("\nDefault sayNothing() method invoked.");
	}
	
	// Functional interface can have Object class methods
	
	// Also known as Single Abstract Method (SAM) interface
	
	
	
}

@FunctionalInterface
interface Sayable2 {
	public void say2();
}

interface Sayable3 {
	public default void say3() {};
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
