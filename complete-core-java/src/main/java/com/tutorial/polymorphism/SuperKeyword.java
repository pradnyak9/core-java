package com.tutorial.polymorphism;

import com.tutorial.domain.HomeLoan;
import com.tutorial.domain.Loan;

/**
 * Super Keyword
 * @author pradnya.khairnar
 * @since 21.06.2022
 *  
 *  # Super Keyword
 *  ---------------
 *  - The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 *  - Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by 
 *  super reference variable.
 *  
 *  # Usage of Java super Keyword
 *  -----------------------------
 *  1. super can be used to refer immediate parent class instance variable.
 *  - We can use super keyword to access the data member or field of parent class. 
 *  It is used if parent class and child class have same fields.
 *  
 *  2. super can be used to invoke immediate parent class method.
 *  - The super keyword can also be used to invoke parent class method. 
 *  It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
 *  
 *  3. super() can be used to invoke immediate parent class constructor.
 *  - The super keyword can also be used to invoke the parent class constructor.
 *  
 *  Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
 */

class Animal {
	
	String color = "white";
	
	Animal() {
		System.out.println("Animal created");
	}
	
	void eat() { System.out.println("Animal eating"); }
}

class Dog extends Animal {
	
	String color = "Black";
	
	Dog() {
		super(); // super() is added in each class constructor automatically by compiler if there is no super() or this().
		System.out.println("Dog created");
	}
	
	
	void printColor() {
		System.out.println("Color of Dog class: "+color);
		System.out.println("Color of Animal class: "+super.color);
	}
	
	void eat() { System.out.println("Dog eating"); }
	
	void bark() { System.out.println("Dog barking"); }
	
	void work() {
		super.eat();
		bark();
	}
}

public class SuperKeyword {
	
	SuperKeyword () {}
	
	public static void main(String[] args) {
		
		System.out.println("******Super keyword example*****");
		Loan loan = new Loan();
		double loanEmi = loan.calculateEMI(300000);
		System.out.println("EMI without additional tax: "+loanEmi);
				
		System.out.println();
		
		HomeLoan hLoan = new HomeLoan();
		double homeLoanEmi = hLoan.calculateEMI(300000);
		
		System.out.println("EMI with additional tax: "+homeLoanEmi);
		
		System.out.println("------------------------------------------------");
		// super can be used to refer immediate parent class instance variable.
		System.out.println("******Super can be used to refer immediate parent class instance variable.*****");
		Dog dog = new Dog();
		dog.printColor();
		
		System.out.println("------------------------------------------------");
		// super can be used to invoke parent class method
		System.out.println("******super can be used to invoke parent class method*****");
		dog.work();
		
		System.out.println("------------------------------------------------");
		// super() can be used to invoke immediate parent class constructor.
		System.out.println("******super() can be used to invoke immediate parent class constructor.*****");
		Dog dog1 = new Dog();
	}
}
