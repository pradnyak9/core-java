/**
 * 
 */
package com.tutorial.basics;

import com.tutorial.domain.Student;

/**
 * @author pradnya.khairnar
 *
 * Constructor in java is used to create the instance of the class. 
 * Constructors are almost similar to methods except for two things – its name is the same as the class name and it has no return type. 
 * Sometimes constructors are also referred to as special methods to initialize an object.
 * 
 * Constructor in Java
 * --------------------
 * Whenever we use new keyword to create an instance of a class, the constructor is invoked and the object of the class is returned. 
 * Since constructor can only return the object to class, it’s implicitly done by java runtime and we are not supposed 
 * to add a return type to it.
 * 
 * If we add a return type to a constructor, then it will become a method of the class. 
 * This is the way java runtime distinguish between a normal method and a constructor. 
 * Let’s assume we have following code in Employee class.
 */
public class Constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(); // this calls default constructor.
		System.out.println();
		
		Student s1 = new Student(1, "Pradnya"); // this calls parameterised constructor.
		s1.displayStudentInfo();
		System.out.println();
		
		Student s2 = new Student(2, "Vivek"); // this calls parameterised constructor.
		s2.displayStudentInfo();
		System.out.println();
		
		Student s3 = new Student(3, "Pratima", 25); // this calls overloaded constructor.
		s3.displayStudentInfo();
		s3.toString();
		System.out.println();
		
		Student s4 = new Student (s1); // this calls copy constructor by constructor.
		s4.displayStudentInfo();
		System.out.println();
		
		Student s5 = new Student();
		System.out.println();
		System.out.println("***Calling copy constructor without constructor***");
		s5.ID = s3.ID;
		s5.name = s3.name;
		s5.age = s3.age;
		s5.displayStudentInfo();
		
	}

}



