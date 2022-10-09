package com.tutorial.polymorphism;

/**
 * Method Overriding
 * @author pradnya.khairnar
 * @since 18.06.2022
 * 
 * 1. Method Overriding
 * - If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * - It is used for runtime polymorphism.
 * - Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
 * 
 * Rules for overriding the method
 * - The method name must be same as it's parent class.
 * - The method must have same parameters as in parent class.
 * - There must be an IS-A  relationship (Inheritance).
 * 
 * Question1: Can we override static method?
 * - No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.
 * 
 * Question2: Why can we not override static method?
 * - It is because the static method is bound with class whereas instance method is bound with an object. 
 * - Static belongs to the class area, and an instance belongs to the heap area.
 * 
 * Question3: Can we override java main method? 
 * - No, because the main is a static method.
 * 
 * 2. Method Overriding with access modifier
 * 
 * 
 */

class Bank {
	int getRateOfInterest() { return 0; }
}

class SBI extends Bank {
	@Override
	int getRateOfInterest() { return 8; }
}

class ICICI extends Bank {
	@Override
	int getRateOfInterest() { return 9; }
}

class Axis extends Bank {
	@Override
	int getRateOfInterest() { return 10; }
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		System.out.println("Default rate of interest: "+bank.getRateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println("ICICI rate of interest: "+icici.getRateOfInterest());
		
		SBI sbi = new SBI();
		System.out.println("SBI rate of interest: "+sbi.getRateOfInterest());
		
		Axis axis = new Axis();
		System.out.println("Axis rate of interest: "+axis.getRateOfInterest());
	}

}
