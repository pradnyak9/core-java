/**
 * 
 */
package com.tutorial.domain;

/**
 * @author pradnya.khairnar
 *
 */

public class Student {
	public int ID;
	public String name;
	public int age;
	public static String college = "RBI"; // declared variable as static so that memory is allocated only once for this field.
	
	public Student () {
		System.out.println("***Calling default constructor***");
		System.out.println("Student created with ID: "+ID+", name: "+name+", age: "+age+" and college: "+college);
	}
	
	public Student( int ID, String name ) {
		System.out.println("***Calling parameterised constructor***");
		this.ID = ID;
		this.name = name;
	}
	
	public Student (int ID, String name, int age) {
		System.out.println("***Calling overloaded constructor***");
		this.ID = ID;
		this.name = name;
		this.age = age;
	}
	
	public Student (Student s) {
		System.out.println("***Calling copy constructor by constructor***");
		this.ID = s.ID;
		this.name = s.name;
		this.age = s.age;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student information: ID: "+ID+", name: "+name+", age: "+age+" and college: "+college);
	}
	
	//static method to change the value of static variable 
	public static String changeCollege(String college) {
		return college;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
