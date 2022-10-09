/**
 * 
 */
package com.tutorial.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.tutorial.domain.Student;

/**
 * @author pradnya.khairnar
 * ---------------
 * | # ArrayList |
 * ---------------
 * - Java ArrayList class uses a dynamic array for storing the elements. 
 * - It is like an array, but there is no size limit. We can add or remove elements any time.
 *  	So, it is much more flexible than the traditional array. It is found in the java.util package.
 * - It inherits the AbstractList class and implements List interface.
 *
 *	_____________________________________________________________________________________
 * | <___ : extends | <--- implements |													 |
 * |________________|_________________|__________________________________________________|
 * | Iterable(I) <___ Collection(I) <___ List(I) <--- AbstractList(C) <___ ArrayList(C)	 |
 * |_____________________________________________________________________________________|
 * 
 * ---------------------------
 * | # ArrayList key Features |
 * ---------------------------
 * - Java ArrayList class can contain duplicate elements.
 * - Java ArrayList class maintains insertion order.
 * - Java ArrayList class is non synchronised.
 * - Java ArrayList allows random access because the array works on an index basis.
 * - In ArrayList, manipulation is a little bit slower than the LinkedList in Java because 
 * 		a lot of shifting needs to occur if any element is removed from the array list.
 * - We can not create an array list of the primitive types, such as int, float, char, etc. 
 * 		It is required to use the required wrapper class in such cases.
 * - Java ArrayList gets initialised by the size. The size is dynamic in the array list, 
 * 		which varies according to the elements getting added or removed from the list.
 * 
 * ---------------------------------
 * | # ArrayList class declaration |
 * ---------------------------------
 * - public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 * 
 *  ------------------------------
 *  | # Constructors of ArrayList |
 *  ------------------------------
 *  
 *  1. ArrayList() 							: It is used to build an empty array list.
 *  2. ArrayList(Collection<? extends E> c) : It is used to build an array list that is initialised with the elements of the collection c.
 *  3. ArrayList(int capacity)				: It is used to build an array list that has the specified initial capacity.
 *  
 *  -----------------------------
 *  | # Methods of ArrayList	|
 *  -----------------------------
 *   _________________________________________________________________________________________________________________________________
 *   | Method																														  |	
 *   |________________________________________________________________________________________________________________________________|
 * 1 | void add(int index, E element)			| It is used to insert the specified element at the specified position in a list.	  |
 *   |________________________________________________________________________________________________________________________________|
 * 2 | boolean add(E e)							| It is used to append the specified element at the end of a list.					  |
 *   |________________________________________________________________________________________________________________________________|										
 * 3 | boolean addAll(Collection<?				| It is used to append all of the elements in the specified collection to the end 	  |
 *   | extends E> c) 							| of this list, in the order that they are returned by the specified collection's iterator.
 *   |
 * 4 | boolean addAll(int index, Collection<?   | It is used to append all the elements in the specified collection, 
 * 	 | extends E> c)							| starting at the specified position of the list.
 *   |
 * 5 | void clear()								| It is used to remove all of the elements from this list.
 * 	 |
 * 6 | void ensureCapacity(int requiredCapacity)| It is used to enhance the capacity of an ArrayList instance.
 * 	 |
 * 7 | E get(int index)							| It is used to fetch the element from the particular position of the list.
 *   |
 * 8 | boolean isEmpty()						| It returns true if the list is empty, otherwise false.
 *   |
 * 9 | Iterator()								| -
 * 	 |	
 * 10| listIterator()							| -
 *   |
 * 11| int lastIndexOf(Object o)				| It is used to return the index in this list of the last occurrence of the specified
 *   | 											| element, or -1 if the list does not contain this element.
 *   |
 * 12| Object[] toArray()						| It is used to return an array containing all of the elements in this list in the correct order. 
 *   |
 * 13| <T> T[] toArray(T[] a)					| It is used to return an array containing all of the elements in this list in the correct order.
 *   |
 * 14| Object clone()							| It is used to return a shallow copy of an ArrayList.
 *   |
 * 15| boolean contains(Object o)				| It returns true if the list contains the specified element.   
 * 
 * 
 * ---------------------------------------------
 * | # Java Non-generic Vs. Generic Collection |
 * ---------------------------------------------
 * - Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
 * - Java new generic collection allows you to have only one type of object in a collection. 
 * 		Now it is type-safe, so type casting is not required at runtime.
 * - Old non-generic example:
 * 		ArrayList list=new ArrayList();
 * - New generic example
 * 		ArrayList<String> list=new ArrayList<String>();
 * - In a generic collection, we specify the type in angular braces. 
 * 	Now ArrayList is forced to have the only specified type of object in it. 
 *  If you try to add another type of object, it gives a compile-time error.
 * 
 * 
 */  
public class Arraylist {

	
	public static void reverseArray(ArrayList<Integer> arr, int n) {
			
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		for(int m = 0; m <= n; m++) {
			arr2.add(arr.get(m));
		}
		
		System.out.println(arr2);
		
		for(int m = arr.size()-1; m > n; m--) {
			arr2.add(arr.get(m));
		}
		
		System.out.println(arr2);
	}
	
	public static void findDuplicates(ArrayList<Integer> arr) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		
		arr.forEach(i -> {
			if(arr2.contains(i) && !duplicate.contains(i)) {
				duplicate.add(i);
			} else {
				arr2.add(i);
			}
		});
		
		System.out.println(arr2);
		Collections.sort(duplicate);
		System.out.println(duplicate);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(2);
		arr.add(7);
		arr.add(1);
		arr.add(4);
//		reverseArray(arr, 2);
		
		findDuplicates(arr);
		
//		ArrayList<String> fruits = new ArrayList<String>();
//		fruits.add("Mango");
//		fruits.add("Banana");
//		fruits.add("Papaya");
//		fruits.add("Apple");
//		fruits.add("Grapes");
////		fruits.add(null);
//		
//		System.out.println("#1. Printing array list: "+fruits);
//		
//		  // =========================================//		
//		 //  #2. Printing array list using Iterator  //
//		// =========================================//
//		System.out.println("\n#2. Printing array list using Iterator: ");
//		Iterator<String> itr = fruits.iterator();
//		while(itr.hasNext()) { //check if iterator has the elements  
//			System.out.println(itr.next()); //printing the element and move to next
//		}
//		
//		// #3. Printing array list using for loop
//		//=========================================
//		System.out.println("\n#3. Printing array list using for loop: ");
//		for(String fruit: fruits) {
//			System.out.println(fruit);
//		}
//		
//		System.out.println("\n1st element of list before change: "+fruits.get(1));
//		
//		fruits.set(1, "Pomogranate");
//		System.out.println("\n#4. Arraylist after setting new value: "+fruits);
//		
//		// #5.1. Sorting array list
//		//=========================================
//		System.out.println("\n#5.1. Sorting arraylist");
//		Collections.sort(fruits);
//		System.out.println(fruits);
//		
//		List<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(12);
//		numbers.add(1);
//		numbers.add(50);
//		numbers.add(10);
//		
//		// #5.2 Sorting number array list
//		//=================================
//		System.out.println("\n#5.2 Sorting number arraylist");
//		Collections.sort(numbers);
//		System.out.println(numbers);
//
//		// #6. Reversing array list by ListIterator
//		//=========================================
//		System.out.println("\n#6. Reversing array list by ListIterator");
//		ListIterator<String> listItr = fruits.listIterator(fruits.size());
//		while(listItr.hasPrevious()) {
//			System.out.println(listItr.previousIndex()+1+". "+listItr.previous());
//		}
//
//		// #7. Traversing list through for loop
//		//=========================================
//		System.out.println("\n#7. Traversing list through for loop");
//		for(int i = 0; i < fruits.size(); i++) {
//			System.out.println(i+1+". "+fruits.get(i));
//		}
//		
//		// #8. Traversing list through for-each loop
//		//===========================================
//		System.out.println("\n#8. Traversing list through for-each loop");
//		fruits.forEach(l -> {
//			System.out.println(l);
//		});
//		
//		// #9. Traversing list through forEachRemaining loop
//		//===================================================
//		System.out.println("\n#9. Traversing list through forEachRemaining loop");
//		Iterator<String> itr1 = fruits.iterator();
//		itr1.forEachRemaining(i -> {
//			System.out.println(i);
//		});
//			
//		// #10. Size of fruit array list
//		//===============================
//		System.out.println("\n#10. Size of fruit array list: "+numbers.size());
//
//		// #11. User-defined class objects in Java ArrayList
//		//===================================================
//		System.out.println("\n#11. User-defined class objects in Java ArrayList");
//		Student s1 = new Student(1, "Pradnya", 20);
//		Student s2 = new Student(2, "Vivek", 21);
//		Student s3 = new Student(3, "Ramya", 23);
//		Student s4 = new Student(4, "Vinayak", 22);
//		Student s5 = new Student(5, "Mahadev", 19);
//		
//		ArrayList<Student> studentList = new ArrayList<Student>();
//		studentList.add(s1);
//		studentList.add(s2);
//		studentList.add(s3);
//		studentList.add(s4);
//		studentList.add(s5);
//		
//		Iterator<Student> itr2 = studentList.iterator();
//		
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		
//		// #12. Java ArrayList addAll example
//		//====================================
//		System.out.println("\n#12. Java ArrayList addAll example: ");
//		ArrayList<String> flowers = new ArrayList<String>();
//		flowers.add("Rose");
//		flowers.add("Jasmine");
//		flowers.add("Sunflower");
//		
//		fruits.addAll(flowers);
//		
//		fruits.forEach(f -> {
//			System.out.println(f);
//		});
//
//		// #13. Java ArrayList remove element example
//		//============================================
//		System.out.println("\n#13. Java ArrayList remove element example: ");
//		System.out.println("\n 13.1 Before removing element: ");
//		flowers.forEach(f -> {
//			System.out.println(f);
//		});
//		flowers.remove(0);
//		
//		System.out.println("\n 13.2 After removing element: ");
//		flowers.forEach(f -> {
//			System.out.println(f);
//		});
//		
//		
//		// #14. Java ArrayList removeAll element example
//		//===============================================
//		System.out.println("\n#14. Java ArrayList removeAll element example: ");
//		System.out.println("\n 14.1 Before removing element: ");
//		fruits.forEach(f -> {
//			System.out.println(f);
//		});
//		
//		System.out.println("\nFlowers list elements: "+flowers);
//		
//		fruits.removeAll(flowers);
//		
//		System.out.println("\n 14.2 After removing element: ");
//		fruits.forEach(f -> {
//			System.out.println(f);
//		});
//		
//
//		// #15. Removing elements on the basis of specified condition
//		//============================================================
//		System.out.println("\n#15. Removing elements on the basis of specified condition ");
//		System.out.println("\nAfter removing Rose element from fuits list with condition ");
//		fruits.removeIf(str -> str.contains("Rose"));
//		fruits.forEach(f -> {
//			System.out.println(f);
//		});
//		
//
//		// #16. Clearing flower list by clear() method
//		//=============================================
//		System.out.println("\n#16. Clearing flower list by clear() method");
//		System.out.println("flowers list before clear() method "+flowers);
//		flowers.clear();
//		System.out.println("flowers list after clear() method "+flowers);
//		System.out.println("Checking isEmpty() method after clearing list: "+flowers.isEmpty());
//		
//
//		// #17. Calling retainAll() method
//		//===============================================
//		System.out.println("\n#17. Calling retainAll() method");
//		ArrayList<String> classAStudents = new ArrayList<String>();
//		classAStudents.add("Vivek");
//		classAStudents.add("Pradnya");
//		classAStudents.add("Akshay");
//		
//		ArrayList<String> classBStudents = new ArrayList<String>();
//		classBStudents.add("Pradnya");
//		classBStudents.add("Vivek");
//		
//		classAStudents.retainAll(classBStudents);
//		
//		Iterator<String> itr3 = classAStudents.iterator();
//		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}
	}
}
