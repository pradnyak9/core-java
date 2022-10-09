package com.tutorial.abstraction;

/**
 * Interfaces
 * @author pradnya.khairnar
 * @since 21.06.2022
 * 
 * # Interfaces
 * - An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * - The interface in Java is a mechanism to achieve abstraction. 
 * - There can be only abstract methods in the Java interface, not method body. 
 * - It is used to achieve abstraction and multiple inheritance in Java.
 * - Java Interface also represents the IS-A relationship.
 * - It cannot be instantiated just like the abstract class.
 * - Since Java 8, we can have default and static methods in an interface.
 * - Since Java 9, we can have private methods in an interface.
 * - 
 * # Why use Java interface?
 * - It is used to achieve abstraction.
 * - By interface, we can support the functionality of multiple inheritance.
 * - It can be used to achieve loose coupling.
 * 
 * How to declare an interface?
 * - An interface is declared by using the interface keyword. 
 * - It provides total abstraction; means all the methods in an interface are declared with the empty body, 
 * and all the fields are public, static and final by default. 
 * - A class that implements an interface must implement all the methods declared in the interface.
 * - Since Java 8, interface can have default and static methods which is discussed later.
 * 
 * Note: 
 * - The Java compiler adds public and abstract keywords before the interface method. 
 * - Moreover, it adds public, static and final keywords before data members.
 * 
 * # The relationship between classes and interfaces:
 * - Class extends another Class
 * - Class implements Interface
 * - Interface extends another Interface
 * 
 * Q) What is marker or tagged interface?
 * - An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. 
 * - They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
 * 
 * # Nested Interface in Java
 * Note: An interface can have another interface which is known as a nested interface.
 */

interface Printable {
	void print();
}

interface Drawable{
	void draw();
	static int cube(int x) { return x*x*x;  }
}

class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("\n Implementing draw method from interface Drawable in Rectangle class");
	}
}

class Circle implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing draw method from interface Drawable in Circle class");
	}
	
}

/**
 * Multiple inheritance
 * @author pradnya.khairnar
 *
 */

class Shape implements Printable, Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing draw method from interface Drawable in Shape class");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing draw method from interface Printable in Shape class");
	}
	
}

/**
 * Interface inheritance
 * @author pradnya.khairnar
 *
 */

interface Showable extends Printable {
	void show();
}

class Triangle implements Showable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing print method from interface Printable in Triangle class");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing show method from interface Showable in Triangle class");
	}
	
}

/**
 * # Java 8 Default Method in Interface
 * Since Java 8, we can have method body in interface. But we need to make it default method.
 * @author pradnya.khairnar
 *
 */

interface A1 {
	void print();
	default void sayHello() {
		System.out.println("Calling default method in interface");
	}
}

class A2 implements A1 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Implementing print method from interface A1 in class A2");
	}
	
}

/**
 * Marker or tagged interface
 * @author pradnya.khairnar
 *
 */


/**
 * Nested interface
 * @author pradnya.khairnar
 *
 */

public class InterfaceExamples implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n Implementing method from interface Printable \n");
	}

	public static void main(String[] args) {
		InterfaceExamples i = new InterfaceExamples();
		i.print();
		
		System.out.println("---------------------------------------------------------------");
		Drawable r = new Rectangle();
		r.draw();
		
		System.out.println("----------------------------------------------------------------");
		Drawable c = new Circle();
		c.draw();
		
		System.out.println();
		System.out.println("\n-----------------------Multiple Inheritance-------------------------\n");
		Shape s = new Shape();
		s.draw();
		s.print();
		
		System.out.println("\n----------------------Interface Inheritance-----------------\n");
		Triangle t = new Triangle();
		t.show();
		t.print();
		
		System.out.println("\n----------------Java 8 Default Method in Interface----------------------\n");
		A2 a =  new A2();
		a.sayHello();
		a.print();
		
		System.out.println("\n-------------Java 8 Static Method in Interface-------------------------\n");
		System.out.println("Calling static cube method from interface Drawable: cube(3)-> "+Drawable.cube(3));
	}
	
}
