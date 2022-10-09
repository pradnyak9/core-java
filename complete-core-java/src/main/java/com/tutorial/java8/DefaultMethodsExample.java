package com.tutorial.java8;

interface Sayable {
	
	// default method
	default void say() {
		System.out.println("\nWelcome to Default method");
	}
	
	public void sayMore(); // abstract method
	
	public void sayNothing(); // abstract method
	
	// static method
	static void staticSayMethod() {
		System.out.println("\nstaticSayMethod() invoked.");
	}
}

public class DefaultMethodsExample implements Sayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultMethodsExample example1 = new DefaultMethodsExample();
		
		// calls default method if not override, otherwise calls default method
		example1.say();
		
		// calls overridden method
		example1.sayMore();
		
		// calls another overridden method
		example1.sayNothing();
		
		// calls static method from interface
		Sayable.staticSayMethod();
	}

	@Override
	public void sayMore() {
		// TODO Auto-generated method stub
		System.out.println("\nsayMore() abstract method invoked. ");
	}
	
	@Override
	public void say() {
		System.out.println("\nsay() abstract method invoked.");
	}

	@Override
	public void sayNothing() {
		// TODO Auto-generated method stub
		System.out.println("\nsayNothing() abstract method invoked.");
	}

}
