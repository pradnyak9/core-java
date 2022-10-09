/**
 * 
 */
package com.tutorial.basics;

import com.tutorial.domain.Student;

/**
 * @author pradnya.khairnar
 *
 * The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and 
 * nested classes. The static keyword belongs to the class than an instance of the class.

 * The static can be:
 * 1. Variable (also known as a class variable)
 * --------------------------------------------
 * - The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
 * 	 for example, the company name of employees, college name of students, etc.
 * - static variables are global variables, which are shared by all instances of the class.
 * - The static variable gets memory only once in the class area at the time of class loading.
 * - It makes program memory efficient (i.e., it saves memory).
 * 
 * 2. Method (also known as a class method)
 * ----------------------------------------
 * - A static method belongs to the class rather than the object of a class.
 * - A static method can be invoked without the need for creating an instance of a class.
 * - A static method can access static data member and can change the value of it.
 * 
 * Restrictions for the static method:
 * 
 * The static method can not use non static data member or call non-static method directly.
 * this and super cannot be used in static context.
 * 
 * 3. Block
 * ---------
 * - Is used to initialize the static data member.
 * - It is executed before the main method at the time of class loading.
 * - static block executes only once irrespective of how many instances created for that class.
 * 
 * 4. Nested class
 * ----------------
 * 
 * 
 * 
 */

public class StaticKeyword {

	int var;
	
	static {
		System.out.println("Static block is invoked before main method");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method is invoked");
//		System.out.println(var); // static method can't access non static variables.
		System.out.println("Without static keyword: ");
		Counter1 c1 = new Counter1();
		Counter1 c2 = new Counter1();
		Counter1 c3 = new Counter1();
		System.out.println();
		
		System.out.println("With static keyword: ");
		Counter2 c4 = new Counter2();
		Counter2 c5 = new Counter2();
		Counter2 c6 = new Counter2();
		System.out.println();
		System.out.println(" **********Static method*********** ");
		
		Student s1 = new Student(111, "Pradnya", 21);
		s1.displayStudentInfo();
		s1.college = Student.changeCollege("KBT COE");
		s1.displayStudentInfo();
		
		
	}

}

class Counter1 {
	int counter = 0;
	
	Counter1 () {
		counter++;  
		System.out.println("Counter value: "+counter);
	}
}

class Counter2 {
	static int counter = 0; //will get memory only once and retain its value
	
	Counter2 () {
		counter++; //incrementing the value of static variable
		System.out.println("Counter value: "+counter);
	}
	
}

/**
 * Interview Questions
 * 
 * 1. Why is the Java main method static?
 * Answer: It is because the object is not required to call a static method. If it were a non-static method, 
 * JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 * 
 * 2. Can we execute a program without main() method?
 * Answer: No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, 
 * it is not possible to execute a Java class without the main method.
 * 
 * 3. 
 */



