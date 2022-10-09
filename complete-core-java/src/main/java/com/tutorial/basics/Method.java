/**
 * 
 */
package com.tutorial.basics;

/**
	* @author pradnya.khairnar
	*
	* Java Method Components:
	*
	* Let’s look at the various components of a java method.
	* 
	* 1. Access Modifiers:
	* ------------------- 
	* Java Method access modifiers defines who can call the method. It’s used to restrict the scope of the method. 
	* There are four access modifiers in java – private, protected, public and default. Apart from access modifiers, we can also specify a method 
	* to be static, in that case, we don’t need to create an object to call the method. We can directly call a static method through class. 
	* Static methods are useful for creating utility methods.
	* 
	* 2. Return Type: 
	* ---------------
	* Java Methods must specify the return type. They can be any primitive type or an object. If the method is not returning anything, 
	* then we must use void as return type.
	* 
	* 3. Method Name: 
	* ---------------
	* Every method in Java must have a name. It’s used to identify the method. We should provide descriptive names for our method 
	* to give some idea about the task performed by the method. If you have written any Java program, I am sure you would have seen java main method.
	* 
	* 4. Method Parameters: 
	* ---------------------
	* We can pass parameters to a method, they are defined in the parenthesis after the method name. 
	* Usually, method statements work on these parameters to achieve their tasks.
	* 
	* 5. Exceptions List: 
	* -------------------
	* Sometimes a java method can throw exceptions. We can define them using throws keyword. 
	* If there are multiple exceptions that can be thrown, then we can separate them using comma.
	* 
	* 6. Method Body: 
	* ---------------
	* This is where all the method operations take place. Method body contains statements to be executed by the method 
	* and they are inside the curly brackets.

 */

public class Method {

	public int add (int x, int y) {
		return x + y;
	}
	
	public static void print (String s) {
		System.out.println(s);
	}
	
	public static String print (String fname, String lname) {
//		System.out.println("welcome,"+fname+" "+lname);
		print("Method calling another method");
		if (fname != null && lname != null) {
			return " Welcome, "+fname+" "+lname;			
		}
		return null;
	}
	
	public int divide ( int x, int y) {
		if (y == 0) throw new IllegalArgumentException(" Cant divide by zero. ");
		return x/y;
	}
	
	public static long factorial (long n) {
		if (n==1) {
			return 1;
		} else {
			return (n * factorial(n-1) );
		}
	}
	
	public static void main(String[] args) throws Exception {
		Method m = new Method();
		System.out.println("Calling add method: add(4,5) ==> "+m.add(4, 5));
//		Method.print("Static method example");
		
		Method.print("1. Method overloading Example");
		System.out.println("-----------------------------");
		System.out.println("calling method print method: Method.print(\"Pradnya\", \"Khairnar\"); ==>"+Method.print("Pradnya", "Khairnar"));
//		Method.print("Pradnya", "Khairnar");
		System.out.println();
		System.out.println();
		
		Method.print("2. Method throwing exception Example");
		System.out.println("-----------------------------");
		System.out.println("Calling method divide(4,2) ==> "+m.divide(4, 2));
		System.out.println("Calling method divide(4,0) and return exception ==> ");
//		System.out.println(+m.divide(4, 0));
		System.out.println();
		System.out.println();
		
		Method.print("3. Recursive method");
		System.out.println("-----------------------------");
		System.out.println("Calling method factorial(5) ==> "+m.factorial(5));
		System.out.println();
		System.out.println();
		
		Method.print("4. Method calling another method");
		System.out.println("--------------------------------");
		System.out.println("Calling method print() ==> "+m.print(null, null));
		
	}
}










