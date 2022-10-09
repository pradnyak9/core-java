/**
 * 
 */
package com.tutorial.java5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pradnya.khairnar
 *
 *
 * The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
 * It makes the code stable by detecting the bugs at compile time.
 * Before generics, we can store any type of objects in the collection, i.e., non-generic. 
 * Now generics force the java programmer to store a specific type of objects.
 * 
 * # Advantage of Java Generics
 * -----------------------------
 * 1. Type-safety: We can hold only a single type of objects in generics. It doesn?t allow to store other objects.
 * 2. Type casting is not required: There is no need to typecast the object.
 * 3. Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. 
 * 	  The good programming strategy says it is far better to handle the problem at compile time than runtime.
 * 
 * 
 * # Wild card - '?' represents wildcard character/symbol
 * 
 * # Upper-bound wild card | SYNTAX: List<? extends Number>  
 * ---------------------------------------------------------
 * - The purpose of upper bounded wildcards is to decrease the restrictions on a variable. 
 * - It restricts the unknown type to be a specific type or a subtype of that type. 
 * - It is used by declaring wildcard character ("?") followed by the extends (in case of, class) 
 * or implements (in case of, interface) keyword, followed by its upper bound.
 * 
 * # Unbound wild card ( <?> )
 * 
 * # Lower-bound wild card ( <? super [CLASS]> )
 */

class MyGen<T> {

	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class Generics {
	
	/**
	 * # Upper-bound wild card
	 * -----------------------
	 * Suppose, we want to write the method for the list of Number and its subtypes (like Integer, Double). 
	 * Using List<? extends Number> is suitable for a list of type Number or any of its subclasses 
	 * whereas List<Number> works with the list of type Number only. 
	 * So, List<? extends Number> is less restrictive than List<Number>.
	 * 
	 * @param num
	 * @return
	 */
	public static Double add(List<? extends Number> num) {
		double sum = 0.0;
		
		for(Number n: num) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
	
	/**
	 * # Unbound wild card
	 * -------------------
	 * The unbounded wild card type represents the list of an unknown type such as List<?>. 
	 * This approach can be useful in the following scenarios: 
	 * - When the given method is implemented by using the functionality provided in the Object class.
	 * - When the generic class contains the methods that don't depend on the type parameter.
	 */
	public static void display(List<?> list) {
			System.out.println(list);
	}
	
	/**
	 * # Lower-bound wildcard
	 * -----------------------
	 * - The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type. 
	 * - It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.
	 */
	public static void displayIntegers(List <? super Integer> list) {
		
		System.out.println(list);
//		for(Object n: list) {
//			System.out.println(n);
//		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGen<Integer> intObj = new MyGen<Integer>();
		intObj.add(12);
		
		System.out.println(intObj.get());
		
		MyGen<String> strObj = new MyGen<String>();
		strObj.add("Pradnya");
		
		System.out.println(strObj.get());
		
		// Upper-bound wild card example
		System.out.println("\n# Upper-bound wildcard example");
		System.out.println("----------------------------------");
		ArrayList<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(12);
		numList1.add(12);
		
		System.out.println(numList1 +" Addition of list elements: "+add(numList1));
		
		ArrayList<Double> numList2 = new ArrayList<Double>();
		numList2.add(15.5);
		numList2.add(16.5);
		
		System.out.println(numList2 + " Addition of list elements: "+add(numList2));
		
		// Unbound wild card example
		System.out.println("\n# Unbound wildcard example");
		System.out.println("----------------------------------");
		System.out.println("Elements of list1");
		display(numList1);
		System.out.println("\nElements of list2");
		display(numList2);
		
		// Lower-bound wild card example
		System.out.println("\n# Lower wildcard example");
		System.out.println("----------------------------------");
		System.out.println("Elements of list1");
		displayIntegers(numList1);
		
		List<Number> list2 = Arrays.asList(2.4, 3.4);
		System.out.println("Elements of list2");
		displayIntegers(list2);
		
	}
}
