package com.tutorial.abstraction;

/**
 * Abstraction
 * @author pradnya.khairnar
 * @since 23.06.2022
 * 
 * # Abstraction
 * -------------
 * - Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * - Another way, it shows only essential things to the user and hides the internal details, 
 * - for example, sending SMS where you type the text and send the message. 
 * - You don't know the internal processing about the message delivery.
 * - Abstraction lets you focus on what the object does instead of how it does it.
 * 
 * # Ways to achieve Abstraction
 * -----------------------------
 * - There are two ways to achieve abstraction in java
 * - Abstract class (0 to 100%)
 * - Interface (100%)
 * 
 * # Abstract Class
 * ----------------
 * - A class which is declared with the abstract keyword is known as an abstract class in Java. 
 * - It can have abstract and non-abstract methods (method with the body).
 * -  It needs to be extended and its method implemented. 
 * - It cannot be instantiated.
 * - It can have constructors and static methods also.
 * - It can have final methods which will force the subclass not to change the body of the method.
 * 
 * # Abstract Method in Java
 * - A method which is declared as abstract and does not have implementation is known as an abstract method.
 * 
 */

abstract class A {
	abstract void print();
}

public class AbstractionExample {

	public static void main(String[] args) {
		
	}
}
