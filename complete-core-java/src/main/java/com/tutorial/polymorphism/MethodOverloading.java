package com.tutorial.polymorphism;

/**
 * MethodOverloading
 * =================
 * @author pradnya.khairnar
 * @since 18.06.2022
 *
 * Method Overloading
 * - If a class has multiple methods with the same name then it is method overloading.
 * - It can be achieved by changing no of arguments or by changing the data type.
 * - It increases the readability of the program.
 * - Compile time polymorphism
 * 
 * Note- 
 * In Java, Method Overloading is not possible by changing the return type of the method only.
 * 
 * Question1: Can we overload java main() method?
 * Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
 * But JVM calls main() method which receives string array as arguments only.
 * 
 * Byte --> short --> int --> long
 * 			char  --> int --> float
 * 					  int --> double
 * 					  long --> float
 * 					  long --> double
 *                    float --> double
 * 
 * As displayed in the above diagram, byte can be promoted to short, int, long, float or double. 
 * The short data type can be promoted to int, long, float or double. 
 * The char data type can be promoted to int, long, float or double and so on.
 */		

class Adder {
	
	// Method by changing the no of arguments
	static int add(int a,int b,int c) {
		System.out.println("Calling add method with 3 arguments -"+a+" "+b+" "+c);
		return a+b+c;
	}
	
	static int add(int a,int b) {
		System.out.println("Calling add method with 2 arguments -"+a+" "+b);
		return a+b;
	}
		
}

class Subtractor {
	
	// Method by changing the return type
	static int subtract(int a, int b) {
		System.out.println("Calling subtract method with int data type-"+a+" "+b);
		return a-b;
	}
	
	static double subtract(double a, double b) {
		System.out.println("Calling subtract method with double data type-"+a+" "+b);
		return a-b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method overloading by changing the no of arguments
		System.out.println(Adder.add(12, 23));
		System.out.println(Adder.add(12, 23, 10));
		
		// Method overloading by changing the data type
		System.out.println(Subtractor.subtract(23, 10));
		System.out.println(Subtractor.subtract(20.89, 12.99));
		
	}
	
	public static void main(String args) {
		System.out.println("Overloading main method with string argument");
	}
	
	public static void main() {
		System.out.println("Overloading main method without any argument");
	}

}