/**
 * 
 */
package com.tutorial.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author pradnya.khairnar
 * _______________________________________________________________________________________________________
 * | <___ : extends | <--- implements |													 				  |
 * |________________|_________________|___________________________________________________________________|
 * | Iterable(I) <___ Collection(I) <___ Set(I) <--- AbstractSet(C) <___ HashSet(C)	<___ LinkedHashSet(C) |
 * |______________________________________________________________________________________________________|
 * 
 * _____________________________________________________________________________________________
 * |																							|
 * | public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  |
 * |____________________________________________________________________________________________|
 * 
 * # HashSet:
 * ==========
 * - Java HashSet class is used to create a collection that uses a hash table for storage. 
 * - It inherits the AbstractSet class and implements Set interface.
 * - HashSet stores the elements by using a mechanism called hashing.
 * - HashSet contains unique elements only.
 * - HashSet allows null value.
 * - HashSet class is non synchronised.
 * - HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
 * - HashSet is the best approach for search operations.
 * - The initial default capacity of HashSet is 16, and the load factor is 0.75
 * 
 * Difference between List and Set
 * -------------------------------
 * - A list can contain duplicate elements whereas Set contains unique elements only.
 * 
 * # LinkedHashSet:
 * ================
 * - Java LinkedHashSet class maintains insertion order.
 * - Keeping the insertion order in the LinkedHashset has some additional costs, 
 * 	both in terms of extra memory and extra CPU cycles. 
 * - Therefore, if it is not required to maintain the insertion order, go for the lighter-weight HashMap or the HashSet instead.
 * 
 * 
 * # TreeSet: 
 * ==========
 * _______________________________________________________________________________________________________
 * | <___ : extends | <--- implements |													 				  |
 * |________________|_________________|___________________________________________________________________|
 * | Iterable(I) <___ Collection(I) <___ Set(I) <--- SortedSet(I) <___ NavigableSet(I)	<___ TreeSet(C)   |
 * |______________________________________________________________________________________________________|
 * 
 * - TreeSet class maintains ascending order.
 * - Java TreeSet class access and retrieval times are quiet fast.
 * - Java TreeSet class maintains ascending order.
 * - Java TreeSet class doesn't allow null elements.
 * - Java TreeSet class maintains ascending order.
 * - 
 * 
 */
public class Set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n====================| Hash Set |====================");
		HashSet<Integer> numHashSet = new HashSet<Integer>();
		numHashSet.add(10);
		numHashSet.add(1);
		numHashSet.add(9);
		numHashSet.add(3);
		numHashSet.add(20);
//		numHashSet.add(null);
		numHashSet.add(20); // Duplicate element
		
		System.out.println("numHashSet: "+numHashSet);
		
		HashSet<Integer> numHashSet1 = new HashSet<Integer>();
		
		numHashSet1.add(40);
		numHashSet1.add(20);
		numHashSet1.add(1);
		numHashSet1.add(100);
		System.out.println("\nNumHashSet1: "+numHashSet1);
		
		numHashSet.addAll(numHashSet1);
		System.out.println("\n Adding numHashSet1 to numHashSet: "+numHashSet);
		
		numHashSet.removeAll(numHashSet1);
		System.out.println("\n Remove all numHashSet1 from numHashSet: "+numHashSet);
		
		numHashSet.removeIf(num -> num.equals(10));
		System.out.println("numHashSet after removing 10: "+numHashSet);
		
		numHashSet.clear();
		System.out.println("numHashSet after clear: "+numHashSet);
		
		System.out.println("\n====================| Linked Hash Set |====================");
		LinkedHashSet<Integer> numLinkedHashSet = new LinkedHashSet<Integer>();
		numLinkedHashSet.add(10);
		numLinkedHashSet.add(1);
		numLinkedHashSet.add(9);
		numLinkedHashSet.add(3);
		numLinkedHashSet.add(20);
		numLinkedHashSet.add(null);
		System.out.println("numLinkedHashSet: "+numLinkedHashSet);
		
		
		System.out.println("\n====================| Tree set |====================");
		TreeSet<Integer> numTree = new TreeSet<Integer>();
		numTree.add(10);
		numTree.add(1);
		numTree.add(9);
		numTree.add(3);
		numTree.add(20);
//		numTree.add(null); // can't add null in tree set
		
		System.out.println(numTree);
	
		System.out.println(numTree.ceiling(7));	
		System.out.println(numTree.floor(16));
		
		System.out.println(numTree.higher(9));
//		System.out.println(numTree.toArray());
		
//		numTree.first();
		
		
		
	}

}
